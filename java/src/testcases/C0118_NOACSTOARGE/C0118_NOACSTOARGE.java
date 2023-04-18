package testcases.C0118_NOACSTOARGE;

import java.io.FileOutputStream;
import java.io.IOException;
import android.content.Context;

public class C0118_NOACSTOARGE {
    private Context context; // Context 객체를 저장하기 위한 멤버 변수
    public C0118_NOACSTOARGE(Context context) {
        this.context = context; // 생성자에서 Context 객체를 받아 멤버 변수에 저장
    }

    public void bad() {
        String fname = "secret.txt";
        String foo = "sensitive data such as credit card number";
        FileOutputStream fos = null;

        try {
            fos = context.openFileOutput(fname, Context.MODE_WORLD_WRITEABLE);
            fos.write(foo.getBytes());
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void good() {
        String fname = "secret.txt";
        String foo = "sensitive data such as credit card number";
        FileOutputStream fos = null;

        try {
            fos = context.openFileOutput(fname, Context.MODE_PRIVATE);
            fos.write(foo.getBytes());
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
