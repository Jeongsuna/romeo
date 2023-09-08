package testcases.C0002_PATHMANIP__CWE22_99;

import testcasesupport.IO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.logging.Level;

public class C0002_PATHMANIP__reader_bad {

    private final static String safeDir = "c:￦￦help_files￦￦";

    public static void main(String[] args) throws IOException {
        String helpFile = args[0];
        try (BufferedReader br = new BufferedReader(new FileReader(safeDir + helpFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {

        }
    }
}
