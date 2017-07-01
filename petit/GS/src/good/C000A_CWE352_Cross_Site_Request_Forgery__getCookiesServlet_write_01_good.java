/*
Filename : CWE352_Cross_Site_Request_Forgery__getCookiesServlet_write_01_bad.java
*/



import testcasesupport.*;

import javax.servlet.http.*;

import javax.servlet.http.*;
import java.util.logging.Logger;

public class C000A_CWE352_Cross_Site_Request_Forgery__getCookiesServlet_write_01_good extends AbstractTestCaseServlet
{

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        Logger log_bad = Logger.getLogger("local-logger");

        data = ""; /* initialize data in case there are no cookies */

        /* Read data from cookies */
        {
            Cookie cookieSources[] = request.getCookies();
            if (cookieSources != null)
            {
                
                data = cookieSources[0].getValue();
            }
        }

        HttpSession session = request.getSession(true);
        String trustedToken = session.getAttribute("token").toString();
        /* FIX */
        if (request.getParameter("token") == null || !request.getParameter("token").equals(trustedToken))
        	return;

        response.getWriter().write(data);

    }


    
    

    /* Below is the main(). It is only used when building this testcase on
       its own for testing or for building a binary to use in testing binary
       analysis tools. It is not used when compiling all the testcases as one
       application, which is how source code analysis tools are tested. */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

