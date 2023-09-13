package testcases.C0116_WRONGPRIVIL__CWE266;

import java.security.AccessController;
import java.security.PrivilegedAction;

public class C0116_WRONGPRIVIL__library_01 {

    public void bad() {
        AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
// privileged code goes here, for example:
                System.loadLibrary("awt");
                return null;
// nothing to return
            }
        });
    }

    public void good(){
        AccessController.doPrivileged(new PrivilegedAction<Void>() {
            public Void run() {
                try {
                    // 특별한 권한이 필요한 작업을 수행하기 전에 권한 검사를 수행합니다.
                    RuntimePermission permission = new RuntimePermission("loadLibrary.awt");
                    AccessController.checkPermission(permission);
                    // 권한 검사가 통과되면 라이브러리를 로드합니다.
                    System.loadLibrary("awt");
                } catch (SecurityException se) {
                    se.printStackTrace();
                }
                return null;
            }
        });
    }


}
