package testcases.C00B5_TWICECOMMETSLINE;

import jakarta.annotation.PostConstruct;
import kr.co.codemind.ccms.core.git.Committer;
import kr.co.codemind.ccms.core.git.JGitUtils;
import kr.co.codemind.ccms.core.jr.JobRequest;
import kr.co.codemind.ccms.dto.response.external_vcs.ExternalVcsDto;
import kr.co.codemind.ccms.entity.ExternalVcs;
import kr.co.codemind.ccms.exception.ApplicationError;
import kr.co.codemind.ccms.exception.ApplicationException;
import kr.co.codemind.ccms.exception.BusinessError;
import kr.co.codemind.ccms.exception.BusinessException;
import kr.co.codemind.ccms.util.FileUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.ListBranchCommand;
import org.eclipse.jgit.api.errors.EmptyCommitException;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.RefAlreadyExistsException;
import org.eclipse.jgit.errors.RepositoryNotFoundException;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.transport.SshSessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Component("internalCI")
@RequiredArgsConstructor
@Slf4j
public class InternalCI {
    private final static String USER_HOME = System.getProperty("user.home");
    public final static String PROJECT_REPOSITORY_BASE = USER_HOME + "/ccms/project-repositories";
    public final static String GIT_REPOSITORIES = USER_HOME + "/repositories";
    private final static String TEMPORARY_REPOSITORY = USER_HOME + "/ccms/temp";
    private final static String SSH_BASE = USER_HOME + "/.ssh";
    private final static String HOOKS_POST_RECEIVE = "hooks/post-receive";
    private final static String HOOKS_COMMON_POST_RECEIVE = USER_HOME + "/.gitolite/hooks/common/post-receive";
    private final static String GITOLITE_HOME = USER_HOME + "/gitolite";

    // branch 조회용 repository 서브 폴더 명
    private final static String PROJECT_REPOSITORY_MASTER = "master";
    private final static String DEFAULT_REMOTE_ALIAS = "origin";

    @Value("${server.port:8080}")
    private int serverPort;

    @Value("${server.ssl.enabled:false}")
    private boolean sslEnabled;

    @Value("${ccms.account-name:ccms}")
    private String accountName;

    @Value("${ccms.project.remote-repository-mirroring-enabled:true}")
    private boolean remoteRepositoryMirroringEnabled;

    private final CommandExecutor commandExecutor;
    private final ResourceLoader resourceLoader;

    @PostConstruct
    private void init() throws CommandException {
        try {
            FileUtils.makeDirectory(TEMPORARY_REPOSITORY);
        } catch (IOException e) {
            throw new ApplicationException(ApplicationError.TEMPORARY_DIRECTORY_FAILED, e);
        }
        Path hookFilePath = this.updateUrlInHooksFile();
        this.setupHooks(hookFilePath);
    }

    /**
     * setup gitolite hooks (execute only once)
     */
    private void setupHooks(Path sourcePath) {
        try {
            Path targetPath = Paths.get(HOOKS_COMMON_POST_RECEIVE);

            if(!Files.exists(targetPath) || !FileUtils.isSameFileContents(sourcePath, targetPath)) {
                Optional<Path> pubFilePath = FileUtils.extractFindFirstFileByExtension(GITOLITE_HOME, "pub");
                if(pubFilePath.isPresent()) {
                    Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
                    commandExecutor.setupGitolite(pubFilePath.get().getFileName().toString());
                    log.info("Setup git hooks: {}", targetPath);
                }
                else {
                    throw new CommandException(String.format("SSH public key file not found. %s", targetPath));
                }
            }
            else {
                log.info("Hooks are already set up: {}", targetPath);
            }
            FileUtils.setFileExecutablePermissions(targetPath);
        } catch (IOException | CommandException e) {
            throw new ApplicationException(ApplicationError.SETUP_HOOKS_FILE_ERROR, e);
        }
    }

    /**
     * Updates the URL in the hooks file.
     */
    private Path updateUrlInHooksFile() {
        Path targetPath = Paths.get(TEMPORARY_REPOSITORY + "/post-receive");
        try {
            log.debug("ssl enabled: {}, server port: {}", sslEnabled, serverPort);
            Resource resource = new ClassPathResource(HOOKS_POST_RECEIVE);
            InputStream inputStream = resource.getInputStream();
            Files.copy(inputStream, targetPath, StandardCopyOption.REPLACE_EXISTING);
            List<String> lines = Files.readAllLines(targetPath);
            List<String> modifiedLines = new ArrayList<>();
            for (String line : lines) {
                // API_URL="http://localhost:8000/hooks/post-receive"
                if (line.contains("localhost:")) {
                    line = line.replaceAll("localhost:\\d+", "localhost:" + serverPort);
                    if(sslEnabled) {
                        line = line.replaceAll("http://", "https://");
                    }
                    log.debug("URL in the script has been updated: {}", line);
                }
                modifiedLines.add(line);
            }
            Files.write(targetPath, modifiedLines);
            log.info("URL in the script has been updated successfully. {}", targetPath);
        } catch (IOException e) {
            log.warn("An error occurred while updating the URL: " + e.getMessage());
            throw new ApplicationException(ApplicationError.UPDATE_URL_ERROR, e);
        }
        return targetPath;
    }

    public void connect(String remoteUrl) {
        UUID uuid = UUID.randomUUID();
        String tempDir = TEMPORARY_REPOSITORY + "/" + uuid;
        try {
            FileUtils.makeDirectory(tempDir);
            commandExecutor.addKnownHost(remoteUrl);
            JGitUtils.connect(Paths.get(tempDir).toFile(), remoteUrl);
        } catch(CommandException e) {
            throw new ApplicationException(ApplicationError.ADD_KNOWN_HOSTS_ERROR, e);
        } catch (IOException e) {
            throw new ApplicationException(ApplicationError.MAKE_TEMPORARY_REPOSITORY_ERROR, e);
        } finally {
            try {
                FileUtils.deleteDirectory(tempDir);
            } catch (IOException e) {
                throw new ApplicationException(ApplicationError.DELETE_TEMPORARY_REPOSITORY_ERROR, e);
            }
        }
    }

    public void addUser(String username, String password) {
        try {
            commandExecutor.addUser(username, password);
        }
        catch (CommandException e) {
            throw new ApplicationException(ApplicationError.ADD_USER_ERROR, e);
        }
    }

    public void deleteUser(String username) {
        try {
            commandExecutor.deleteUser(username);
        } catch (CommandException e) {
            throw new ApplicationException(ApplicationError.DELETE_USER_ERROR, e);
        }
    }

    public void addUserPublicKey(String username, String sshPublicKey) {
        try {
            commandExecutor.addUserPublicKey(username, sshPublicKey);
            commandExecutor.commitAndPushGitAdmin("Add public key for " + username + ".pub");
        } catch (CommandException e) {
            throw new ApplicationException(ApplicationError.ADD_USER_PUBLIC_KEY_ERROR, e);
        }
    }

    public String getUserPublicKey(String username) {
        Path path = Paths.get(CommandExecutor.GIT_ADMIN_KEY + "/" + username + ".pub");
        try {
            if(!Files.exists(path)) {
                return "";
            }
            return Files.readString(path);
        } catch (IOException e) {
            throw new ApplicationException(ApplicationError.GET_PUBLIC_KEY_ERROR, e);
        }
    }

    public void removeUserPublicKey(String username) {
        try {
            commandExecutor.removeUserPublicKey(username);
            commandExecutor.commitAndPushGitAdmin("Remove public key for " + username + ".pub");
        } catch (CommandException e) {
            throw new ApplicationException(ApplicationError.REMOVE_USER_PUBLIC_KEY_ERROR, e);
        }
    }

    public void createRepository(String repositoryName, ExternalVcs externalVcs) {
        try {
            GitoliteConfiguration.addRepository(repositoryName);
        } catch (RepositoryAlreadyExistsException e) {
            log.warn("Repository already exists: {}", repositoryName);
        }
        GitoliteConfiguration.update(repositoryName, accountName, Permission.READ_WRITE_ALL);       // 기본 setup 계정에 대한 권한 부여
        try {
            commandExecutor.commitAndPushGitAdmin("Add repository " + repositoryName);
        } catch (CommandException e) {
            throw new ApplicationException(ApplicationError.GIT_ADMIN_PUSH_ERROR, e);
        }

        // gitolite hook delay
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            log.warn("An error occurred while waiting for 1 second: " + e.getMessage());
        }

        // remote repository mirroring
        if (this.remoteRepositoryMirroringEnabled) {
            // git clone --mirror <URL>
            Path projectRepositoryPath = InternalCI.getProjectRepositoryPath(repositoryName);
            try {
                String url = JGitUtils.buildExternalUrl(externalVcs.getUrl(), repositoryName);
                FileUtils.makeDirectory(projectRepositoryPath.toString());
                commandExecutor.addKnownHost(url);
                commandExecutor.cloneMirrorRepository(url, projectRepositoryPath.toString());
                // mv ./repository.git to ~/repositories
                commandExecutor.moveDirectory(projectRepositoryPath + "/" + JGitUtils.getFirstRepositoryName(url), GIT_REPOSITORIES);
                commandExecutor.setupGitolite();
            } catch (IOException e) {
                throw new ApplicationException(ApplicationError.MAKE_PROJECT_DIRECTORY_ERROR, projectRepositoryPath.toString(), e);
            }
            catch(CommandException e) {
                throw new ApplicationException(ApplicationError.CLONE_MIRROR_REPOSITORY_ERROR, e);
            }
        }

        // create project repository (master - branch 목록 조회용)
        try {
            createProjectRepository(repositoryName, PROJECT_REPOSITORY_MASTER);
        } catch (ApplicationException e) {
            deleteProjectRepository(repositoryName, PROJECT_REPOSITORY_MASTER);
            throw e;
        }
    }

    public void removeRepository(String repositoryName) {
        GitoliteConfiguration.removeRepository(repositoryName);
        try {
            commandExecutor.commitAndPushGitAdmin("Remove repository " + repositoryName);
        } catch (CommandException e) {
            throw new ApplicationException(ApplicationError.REMOVE_REPOSITORY_ERROR, e);
        }
        try {
            commandExecutor.deleteProjectRepository(repositoryName);
        } catch (CommandException e) {
            log.warn("Failed to delete project repository: {}, detail: {}", repositoryName, e.getMessage());
        }
    }

    public void createProjectRepository(String repositoryName, String jobRequestId) {
        // create job request repository
        try {
            commandExecutor.cloneRepository(repositoryName, jobRequestId);
        } catch (CommandException e) {
            throw new ApplicationException(ApplicationError.CLONE_REPOSITORY_ERROR, e);
        }
    }

    public void deleteProjectRepository(String repositoryName, String jobRequestId) {
        // delete job request repository
        try {
            commandExecutor.deleteProjectRepository(repositoryName, jobRequestId);
        } catch (CommandException e) {
            log.warn("Failed to delete project repository: {}, !{}, detail: {}", repositoryName, jobRequestId, e.getMessage());
        }
    }

    public void addProjectUser(String repositoryName, String username) {
        this.addProjectUser(new String[]{repositoryName}, new String[]{username}, Permission.READ_WRITE_ALL);
    }

    public void addProjectUser(String repositoryName, String[] usernames) {
        this.addProjectUser(new String[]{repositoryName}, usernames, Permission.READ_WRITE_ALL);
    }

    public void addProjectUser(String[] repositoryNames, String username) {
        this.addProjectUser(repositoryNames, new String[]{username}, Permission.READ_WRITE_ALL);
    }

    public void addProjectUser(String[] repositoryNames, String[] usernames, Permission permission) {
        if(repositoryNames.length == 0) {
            throw new BusinessException(BusinessError.REPOSITORY_NOT_FOUND);
        }
        GitoliteConfiguration.update(repositoryNames, usernames, permission);
        try {
            commandExecutor.commitAndPushGitAdmin("Added project user " + usernames[0] + (usernames.length > 1 ? " and " + String.valueOf(usernames.length-1) + " more" : "") +
                    " to repository " + repositoryNames[0] + (repositoryNames.length > 1 ? " and " + String.valueOf(repositoryNames.length-1) + " more" : "") +
                    " with permission " + permission.getPermission());
        } catch (CommandException e) {
            throw new ApplicationException(ApplicationError.ADD_PROJECT_USER_ERROR, e);
        }
    }

    public void deleteProjectUser(String repositoryName, String username) {
        this.deleteProjectUser(new String[]{repositoryName}, username);
    }

    public void deleteProjectUser(String[] repositoryNames, String username) {
        GitoliteConfiguration.remove(repositoryNames, username);
        try {
            commandExecutor.commitAndPushGitAdmin("Deleted project user " + username +
                    " to repository " + repositoryNames[0] + (repositoryNames.length > 1 ? " and " + String.valueOf(repositoryNames.length-1) + " more" : ""));
        } catch (CommandException e) {
            throw new ApplicationException(ApplicationError.REMOVE_PROJECT_USER_ERROR, e);
        }
    }

    public void deleteAllProjectUsers(String repositoryName) {
        GitoliteConfiguration.removeAllUsers(repositoryName, accountName);
        try {
            commandExecutor.commitAndPushGitAdmin("Deleted project all users to repository " + repositoryName);
        } catch (CommandException e) {
            throw new ApplicationException(ApplicationError.REMOVE_PROJECT_USER_ERROR, e);
        }
    }

    public static Path getProjectRepositoryPath(String repositoryName) {
        return getProjectRepositoryPath(repositoryName, PROJECT_REPOSITORY_MASTER, false);
    }

    public static Path getProjectRepositoryPath(String repositoryName, boolean suffixBranch) {
        return getProjectRepositoryPath(repositoryName, PROJECT_REPOSITORY_MASTER, suffixBranch);
    }

    public static Path getProjectRepositoryPath(String repositoryName, String jobRequestId) {
        return getProjectRepositoryPath(repositoryName, jobRequestId, false);
    }

    public static Path getProjectRepositoryPath(String repositoryName, String jobRequestId, boolean suffixBranch) {
        return Paths.get(PROJECT_REPOSITORY_BASE + "/" + repositoryName + "/" + jobRequestId + "/" + (suffixBranch ? repositoryName : ""));
    }

    private Git openRepository(String repositoryName) throws IOException, GitAPIException {
        try {
            return JGitUtils.open(getProjectRepositoryPath(repositoryName).toFile());
        }
        catch(RepositoryNotFoundException | GitAPIException e) {
            return JGitUtils.open(getProjectRepositoryPath(repositoryName, true).toFile());
        }
    }

    private Git openRepository(String repositoryName, long jobRequestId) throws IOException, GitAPIException {
        try {
            return JGitUtils.open(getProjectRepositoryPath(repositoryName, String.valueOf(jobRequestId)).toFile());
        }
        catch(RepositoryNotFoundException | GitAPIException e) {
            return JGitUtils.open(getProjectRepositoryPath(repositoryName, String.valueOf(jobRequestId), true).toFile());
        }
    }


    public List<RevCommit> diffCommits(String repositoryName, long jobRequestId, String sourceBranch, String targetBranch) throws RepositoryNotFoundException {
        try (Git git = openRepository(repositoryName, jobRequestId)) {
            try {
                JGitUtils.checkout(git, sourceBranch);
            } catch (RefAlreadyExistsException e) {
                log.warn("Failed to checkout branch: {}, detail: {}", sourceBranch, e.getMessage());
            }
            return JGitUtils.diffCommits(git, sourceBranch, targetBranch);
        } catch (RepositoryNotFoundException e) {
            throw e;
        } catch (GitAPIException | IOException e) {
            throw new ApplicationException(ApplicationError.DIFF_COMMIT_ERROR, e);
        }
    }

    public List<Ref> getBranches(String repositoryName) {
        try (Git git = openRepository(repositoryName)) {
            git.fetch().call();
            return git.branchList().setListMode(ListBranchCommand.ListMode.REMOTE).call();
        } catch (GitAPIException | IOException e) {
            throw new ApplicationException(ApplicationError.GET_BRANCHES_ERROR, e);
        }
    }

    public void mergeAndPush(String repositoryName, JobRequest jr) {
        Committer committer = new Committer(jr.getProjectJr().getCreatedUser().getId(),
                jr.getProjectJr().getCreatedUser().getName(),
                jr.getProjectJr().getCreatedUser().getEmail());
        mergeAndPush(repositoryName,
                committer,
                jr.getId(),
                jr.getSourceBranch(),
                jr.getTargetBranch());
    }

    public void mergeAndPush(String repositoryName, Committer committer, long jobRequestId, String sourceBranch, String targetBranch) {
        try (Git git = openRepository(repositoryName, jobRequestId)) {
            SshSessionFactory sshSessionFactory = JGitUtils.createSessionFactory();
            JGitUtils.mergeBranches(git, sourceBranch, targetBranch, committer);
            JGitUtils.push(git, sshSessionFactory);
        } catch (GitAPIException | IOException e) {
            throw new ApplicationException(ApplicationError.MERGE_AND_PUSH_ERROR, e);
        }
    }

    public void addAndPushToRemote(String repositoryName, long jobRequestId, ExternalVcsDto externalVcs) {
        try (Git git = openRepository(repositoryName, jobRequestId)) {
            String remoteUrl = JGitUtils.buildExternalUrl(externalVcs.getUrl(), repositoryName);
            commandExecutor.addKnownHost(remoteUrl);
            SshSessionFactory sshSessionFactory = JGitUtils.createSessionFactory();
            String remoteAlias = "remote-" + externalVcs.getId();
            JGitUtils.updateRemoteIfUpdated(git, remoteAlias, remoteUrl);
            JGitUtils.push(git, sshSessionFactory, remoteAlias);
        } catch (GitAPIException | IOException | URISyntaxException | CommandException e) {
            throw new ApplicationException(ApplicationError.PUSH_TO_REMOTE_ERROR, e);
        }
    }

    public String getPublicKey() {
        try {
            return Files.readString(Paths.get(SSH_BASE + "/id_rsa.pub"));
        } catch (NoSuchFileException noSuchFileException) {
            throw new BusinessException(BusinessError.SSH_PUBLIC_KEY_NOT_FOUND, noSuchFileException);
        }catch (IOException e) {
            throw new ApplicationException(ApplicationError.READ_SSH_PUBLIC_KEY_ERROR, e);
        }
    }

    public RevCommit getLatestCommit(String repositoryName, String branchName) {
        try (Git git = openRepository(repositoryName)) {
            git.fetch().call();
            RevCommit commit = JGitUtils.getLatestCommit(git, branchName);
            if(commit == null) {
                throw new EmptyCommitException("Failed to get latest commit from branch " + branchName);
            }
            return commit;
        }
        catch (GitAPIException | IOException e) {
            throw new ApplicationException(ApplicationError.LATEST_COMMIT_ERROR, e);
        }
    }
}