package testcases.CWE80_XSS.s01;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CWE80_XSS__Combi {
    public void responseWrite(HttpServletResponse response, String s) throws IOException {
        response.getWriter().println("<br>bad(): data = " + s);
    }
}
