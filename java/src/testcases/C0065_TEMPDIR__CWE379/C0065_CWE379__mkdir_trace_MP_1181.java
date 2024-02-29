package testcases.C0065_TEMPDIR__CWE379;

import java.io.File;

public class C0065_CWE379__mkdir_trace_MP_1181 {
    public void bad(String dir) {
        try {
            File file2=new File(dir);
            file2.mkdir();
        }catch(Exception e) {}
    }
}
