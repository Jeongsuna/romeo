package testcases.C00A7_WRONGDEFPERM__CWE276;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.HashSet;
import java.util.Set;

public class C00A7_WRONGDEFPERM__simple_01 {
    public static void bad1(String[] args) {
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

                Set<PosixFilePermission> permissions = new HashSet<>();
                permissions.add(PosixFilePermission.OWNER_READ);
                permissions.add(PosixFilePermission.OWNER_WRITE);
                
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

                Set<PosixFilePermission> permissions = new HashSet<>();
                Files.setPosixFilePermissions(Paths.get(tempFile.getAbsolutePath()), permissions);

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

                Set<PosixFilePermission> permissions = new HashSet<>();
                permissions.add(PosixFilePermission.OWNER_READ);
                permissions.add(PosixFilePermission.OWNER_WRITE);
                Files.setPosixFilePermissions(Paths.get(tempFile.getAbsolutePath()), permissions);

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

                Set<PosixFilePermission> permissions = Set.of(PosixFilePermission.OWNER_READ, PosixFilePermission.OWNER_WRITE);
                Files.setPosixFilePermissions(Paths.get(tempFile.getAbsolutePath()), permissions);

            } else {
                System.out.println("파일 생성 실패");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void good3(String[] args) {
        try {
            File tempFile = File.createTempFile("temp", ".txt");
            if (tempFile.exists()) {
                System.out.println("파일 생성 성공: " + tempFile.getAbsolutePath());

                Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw----r--");//
                Files.setPosixFilePermissions(Paths.get(tempFile.getAbsolutePath()), permissions);

            } else {
                System.out.println("파일 생성 실패");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}