/*
Filename : CWE307_Improper_Restriction_Of_Excessive_Authentication_Attempts__Servlet_Captcha_01_bad.java
*/



import testcasesupport.*;

import testcasesupport.Util;
import java.util.logging.Logger;



import javax.servlet.http.*;
import java.io.*;

public class C001F_CWE307_Improper_Restriction_Of_Excessive_Authentication_Attempts__Servlet_Captcha_01_good extends AbstractTestCaseServlet
{
	int attempts = 0;
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
    	++attemps;
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        /* FIX */
        if (attempts < 3) {
	        if (username == null || password == null || !RUtil.isAuthenticatedUser(username, password))
	        {
	        		response.getWriter().println("Invalid username, password<br/>");
	        }
	        else
	    	{
	    		response.getWriter().println(username + " has successfully logged in!");
	    	}
        }
    }


    
    

    /* Below is the main(). It is only used when building this testcase on
       its own for testing or for building a binary to usezzzzzzzzz in testing binary
       analysis tools. It is not used when compiling all the testcases as one
       application, which is how source code analysis tools are tested. */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

