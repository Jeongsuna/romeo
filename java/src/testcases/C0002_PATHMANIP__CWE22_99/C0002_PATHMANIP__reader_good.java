package testcases.C0002_PATHMANIP__CWE22_99;

import testcasesupport.IO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.logging.Level;

public class C0002_PATHMANIP__reader_good {

    private final static String safeDir = "c:￦￦help_files￦￦";

    //경로조작 문자열 포함 여부를 확인하고 조치 후 사용하도록 한다.
    public static void main(String[] args) throws IOException {
        String helpFile = args[0];
        if (helpFile != null) {
            helpFile = helpFile.replaceAll("\\\\.{2,}[/\\\\\\\\]", "");

        }
        try (BufferedReader br = new BufferedReader(new FileReader(safeDir + helpFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {

        }
    }
}
