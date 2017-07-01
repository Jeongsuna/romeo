/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE615_Info_Exposure_by_Comment__Servlet_01.java
Label Definition File: CWE615_Info_Exposure_by_Comment__Servlet.label.xml
Template File: point-flaw-01.tmpl.java
*/
/*
* @description
* CWE: 615 Information Exposure by Comment
* Sinks:
*    GoodSink: no disclosure of username and password
*    BadSink : disclose username and password
* Flow Variant: 01 Baseline
*
* */



import testcasesupport.*;

import javax.servlet.http.*;

public class C001C_CWE615_Info_Exposure_by_Comment__Servlet_01_good extends AbstractTestCaseServlet
{
    private void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        /* FIX: no info exposure in client-side code comments */
        response.getWriter().println("<form action=\"/test\" method=post>" +
        "<input type=text name=dbusername>" +
        "<input type=test name=dbpassword>" +
        "<input type=submit value=Submit>" +
        "</form>");

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

