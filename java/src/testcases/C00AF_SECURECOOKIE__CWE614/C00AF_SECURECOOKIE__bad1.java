package testcases.C00AF_SECURECOOKIE__CWE614;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.IOException;

public class CookieServlet extends HttpServlet {

    private static final String ACCOUNT_ID = "accountID";

    @Override
    protected void bad1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String acctID = "123456";

        Cookie c = new Cookie(ACCOUNT_ID, acctID);

        response.addCookie(c);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Cookie has been set with Account ID: " + acctID + "</h1>");
        out.println("</body></html>");
    }

    protected void bad2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String acctID = "123456";

        Cookie c = new Cookie(ACCOUNT_ID, acctID);
        c.setSecure(false);
        response.addCookie(c);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Cookie has been set with Account ID: " + acctID + "</h1>");
        out.println("</body></html>");
    }
}