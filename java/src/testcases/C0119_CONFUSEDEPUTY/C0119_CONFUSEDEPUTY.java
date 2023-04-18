package testcases.C0119_CONFUSEDEPUTY;

import android.content.Context;
import android.content.pm.PackageManager;
import android.Manifest;
import android.widget.Toast;

public class C0119_CONFUSEDEPUTY {
    private Context context; // Context 객체를 저장하기 위한 멤버 변수

    public C0119_CONFUSEDEPUTY(Context context) {
        this.context = context; // 생성자에서 Context 객체를 받아 멤버 변수에 저장
    }

    public void bad() {
        boolean flag = false;
        if (context.checkCallingOrSelfPermission("com.test.testpermission") ==
                PackageManager.PERMISSION_GRANTED) {
            flag = true;
        }
    }
    public void good() {
        Context foo = context; // 현재 activity에서 context를 가져옵니다.
        if (foo.checkCallingPermission(Manifest.permission.INTERNET) == PackageManager.PERMISSION_DENIED) {
            Toast.makeText(context,
                    "INTERNET PERMISSION_DENIED",
                    Toast.LENGTH_SHORT).show();
        } else if (foo.checkCallingPermission(Manifest.permission.INTERNET) == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(context,
                    "INTERNET PERMISSION_GRANTED",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
