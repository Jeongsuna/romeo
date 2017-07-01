/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE539_Information_Exposure_Through_Persistent_Cookie__Servlet_01.java
Label Definition File: CWE539_Information_Exposure_Through_Persistent_Cookie__Servlet.label.xml
Template File: point-flaw-01.tmpl.java
*/
/*
* @description
* CWE: 539 Information Exposure Through Persistent Cookie
* Sinks:
*    GoodSink: Do not use a persistent cookie
*    BadSink : Use a persistent cookie
* Flow Variant: 01 Baseline
*
* */



import testcasesupport.*;

import javax.servlet.http.*;

public class C001B_CWE539_Information_Exposure_Through_Persistent_Cookie__Servlet_01_good extends AbstractTestCaseServlet
{
    private void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        Cookie cookie = new Cookie("SecretMessage", "test");

        /* FIX: Set the max age to a negative value, so that it will only persist until the browser is shutdown */
        cookie.setMaxAge(-1);

    }

    /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

