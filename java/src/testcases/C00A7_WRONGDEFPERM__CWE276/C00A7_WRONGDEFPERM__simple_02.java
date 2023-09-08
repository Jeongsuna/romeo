package testcases.C00A7_WRONGDEFPERM__CWE276;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.List;

public class C00A7_WRONGDEFPERM__simple_02 {

    public static void bad(String[] args) {
        try {
            File tempFile = File.createTempFile("temp", ".txt");

            if (tempFile.exists()) {
                System.out.println("파일 생성 성공: " + tempFile.getAbsolutePath());
            } else {
                System.out.println("파일 생성 실패");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bad2(String[] args) {
        try {
            File tempFile = File.createTempFile("temp", ".txt");

            if (tempFile.exists()) {
                System.out.println("파일 생성 성공: " + tempFile.getAbsolutePath());

                Path tempFilePath = Paths.get(tempFile.getAbsolutePath());
                AclFileAttributeView attrView = Files.getFileAttributeView(tempFilePath, AclFileAttributeView.class);
                UserPrincipal userPrincipal = tempFilePath.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName(System.getProperty("user.name"));

                // 파일 소유자에게 읽기 및 쓰기 권한을 부여하는 ACE(액세스 제어 항목)를 생성합니다.
                AclEntry.Builder builder = AclEntry.newBuilder().setPrincipal(userPrincipal);
                builder.setPermissions(AclEntryPermission.READ_DATA, AclEntryPermission.WRITE_DATA);
                AclEntry newEntry = builder.build();

                List<AclEntry> aclList = attrView.getAcl();
                aclList.add(newEntry);
                attrView.setAcl(aclList);

            } else {
                System.out.println("파일 생성 실패");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bad3(String[] args) {
        try {
            File tempFile = File.createTempFile("temp", ".txt");

            if (tempFile.exists()) {
                System.out.println("파일 생성 성공: " + tempFile.getAbsolutePath());

                Path tempFilePath = Paths.get(tempFile.getAbsolutePath());
                AclFileAttributeView attrView = Files.getFileAttributeView(tempFilePath, AclFileAttributeView.class);
                UserPrincipal userPrincipal = tempFilePath.getFileSystem().getUserPrincipalLookupService()
                        .lookupPrincipalByName(System.getProperty("user.name"));

                // 파일 소유자에게 읽기 및 쓰기 권한을 부여하는 ACE(액세스 제어 항목)를 생성합니다.
                AclEntry ownerEntry = AclEntry.newBuilder()
                        .setType(AclEntryType.ALLOW)
                        .setPrincipal(userPrincipal)
                        .setPermissions(AclEntryPermission.READ_DATA, AclEntryPermission.WRITE_DATA).build();

                List<AclEntry> aclList = attrView.getAcl();
                attrView.setAcl(aclList);

            } else {
                System.out.println("파일 생성 실패");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void good1(String[] args) {
        try {
            File tempFile = File.createTempFile("temp", ".txt");

            if (tempFile.exists()) {
                System.out.println("파일 생성 성공: " + tempFile.getAbsolutePath());

                Path tempFilePath = Paths.get(tempFile.getAbsolutePath());
                AclFileAttributeView attrView = Files.getFileAttributeView(tempFilePath, AclFileAttributeView.class);
                UserPrincipal userPrincipal = tempFilePath.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName(System.getProperty("user.name"));

                // 파일 소유자에게 읽기 및 쓰기 권한을 부여하는 ACE(액세스 제어 항목)를 생성합니다.
                AclEntry newEntry = AclEntry.newBuilder()
                        .setType(AclEntryType.ALLOW)
                        .setPrincipal(userPrincipal)
                        .setPermissions(AclEntryPermission.READ_DATA, AclEntryPermission.WRITE_DATA)
                        .build();

                List<AclEntry> aclList = attrView.getAcl();
                aclList.add(newEntry);
                attrView.setAcl(aclList);

            } else {
                System.out.println("파일 생성 실패");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void good2(String[] args) {
        try {
            File tempFile = File.createTempFile("temp", ".txt");

            if (tempFile.exists()) {
                System.out.println("파일 생성 성공: " + tempFile.getAbsolutePath());

                Path tempFilePath = Paths.get(tempFile.getAbsolutePath());
                AclFileAttributeView attrView = Files.getFileAttributeView(tempFilePath, AclFileAttributeView.class);
                UserPrincipal userPrincipal = tempFilePath.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName(System.getProperty("user.name"));

                // 파일 소유자에게 읽기 및 쓰기 권한을 부여하는 ACE(액세스 제어 항목)를 생성합니다.
                AclEntry.Builder builder = AclEntry.newBuilder().setPrincipal(userPrincipal);
                builder.setType(AclEntryType.ALLOW).setPermissions(AclEntryPermission.READ_DATA, AclEntryPermission.WRITE_DATA);
                AclEntry newEntry = builder.build();

                List<AclEntry> aclList = attrView.getAcl();
                aclList.add(newEntry);
                attrView.setAcl(aclList);

            } else {
                System.out.println("파일 생성 실패");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
