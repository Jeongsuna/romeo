/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE489_Leftover_Debug_Code__Servlet_01.java
Label Definition File: CWE489_Leftover_Debug_Code__Servlet.label.xml
Template File: point-flaw-01.tmpl.java
*/
/*
* @description
* CWE: 489 Leftover Debug Code
* Sinks:
*    GoodSink: no debugging bypass
*    BadSink : debugging request parameter bypasses authentication
* Flow Variant: 01 Baseline
*
* */



import testcasesupport.*;

import javax.servlet.http.*;
import java.io.*;

public class C002A_CWE489_Leftover_Debug_Code__Servlet_01_good extends AbstractTestCaseServlet
{
    private void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        if (request.getParameter("username") == null ||
        request.getParameter("password") == null)
        {
            return;
        }

        Boolean isAuthenticated = false;
        HttpSession session = request.getSession(true);
        /* FIX: debug code removed */
        /* INCIDENTAL: hardcoded username and password */
        if (request.getParameter("username").equals("testuser") &&
        request.getParameter("password").equals("012345679ABCDEF"))
        {
            session.setAttribute("username", "testuser");
            session.setAttribute("isAdmin", "false");
            isAuthenticated = true;
        }
        else
        {
            isAuthenticated = false;
        }

        if (isAuthenticated)
        {
            response.getWriter().println("You are authenticated!");
        }
        else
        {
            response.getWriter().println("Sorry, bad username or password.");
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

