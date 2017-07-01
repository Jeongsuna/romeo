/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE497_Exposure_of_System_Data__Servlet_01.java
Label Definition File: CWE497_Exposure_of_System_Data__Servlet.label.xml
Template File: point-flaw-01.tmpl.java
*/
/*
* @description
* CWE: 497 Exposure of System Data to an Unauthorized Control Sphere
* Sinks:
*    GoodSink: no exposing
*    BadSink : expose the path variable to the user
* Flow Variant: 01 Baseline
*
* */



import testcasesupport.*;

import javax.servlet.http.*;
import java.io.*;

public class C002B_CWE497_Exposure_of_System_Data__Servlet_01_bad extends AbstractTestCaseServlet
{

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        /* FLAW: system information exposed */
        response.getWriter().println("Not in path: " + System.getenv("PATH"));

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

