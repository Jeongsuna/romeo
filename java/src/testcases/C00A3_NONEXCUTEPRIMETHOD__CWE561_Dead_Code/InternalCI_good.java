package testcases.C00A3_NONEXCUTEPRIMETHOD__CWE561_Dead_Code;

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
}
