package testcases.CWE80_XSS.s01;

import javax.servlet.http.HttpServletResponse;

public class CWE80_XSS__Combi {
    public void responseWrite(HttpServletResponse response, String s) {
        response.getWriter().println("<br>bad(): data = " + s);
    }
}
