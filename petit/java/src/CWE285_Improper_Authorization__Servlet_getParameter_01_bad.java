/*
Filename : CWE285_Improper_Authorization__Servlet_getParameter_01_bad.java
*/

package testcases.CWE285_Improper_Authorization;

import testcasesupport.*;

import testcasesupport.RUtil;
import java.util.logging.Logger;



import javax.servlet.http.*;
import java.io.*;

public class CWE285_Improper_Authorization__Servlet_getParameter_01_bad extends AbstractTestCaseServlet
{

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;


        data = "passwd";


        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String msgId = request.getParameter("msgId");
        if (username == null || password == null || !RUtil.isAuthenticatedUser(username, password))
        {
            throw new Exception("Invalid username, password");
        }
        if (msgId == null)
        {
            throw new Exception("Invalid msgId");            
        }
        RMessage msg = RUtil.LookupRMessageObject(msgId);
        /* FLAW */
        if (msg != null) {
            response.getWriter().println("From: " + msg.getUserName());
            response.getWriter().println("Subject: " + msg.getSubField());
            response.getWriter().println("Body: " + msg.getBodyField());            
        }

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

