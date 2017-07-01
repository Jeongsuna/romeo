/*
Filename : CWE807_Reliance_on_Untrusted_Inputs_in_a_Security_Decision__Servlet_basic_equals_01_bad.java
*/



import testcasesupport.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;

import java.util.logging.Logger;

import java.net.URLEncoder;


import javax.servlet.http.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;

import java.util.logging.Logger;

public class C000D_CWE807_Reliance_on_Untrusted_Inputs_in_a_Security_Decision__Servlet_basic_equals_01_good extends AbstractTestCaseServlet
{
    
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String userRole = "";

        /* FIX */
        userRole = request.getSession().getValue("role");
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

