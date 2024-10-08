/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE497_Exposure_of_System_Data__Servlet_14.java
Label Definition File: CWE497_Exposure_of_System_Data__Servlet.label.xml
Template File: point-flaw-14.tmpl.java
*/
/*
* @description
* CWE: 497 Exposure of System Data to an Unauthorized Control Sphere
* Sinks:
*    GoodSink: no exposing
*    BadSink : expose the path variable to the user
* Flow Variant: 14 Control flow: if(IO.static_five==5) and if(IO.static_five!=5)
*
* */

package testcases.C002B_SYSTEMLEAK__CWE497_Exposure_of_System_Data.s01;

import testcasesupport.*;

import javax.servlet.http.*;
import java.io.*;

public class CWE497_Exposure_of_System_Data__Servlet_14 extends AbstractTestCaseServlet
{

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if (IO.staticFive==5)
        {
            /* FLAW: system information exposed */
            response.getWriter().println("Not in path: " + System.getenv("PATH"));
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            /* FIX: error message is general */
            response.getWriter().println("Not in path");

        }
    }

    /* good1() changes IO.static_five==5 to IO.static_five!=5 */
    private void good1(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if(IO.staticFive!=5)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            /* FLAW: system information exposed */
            response.getWriter().println("Not in path: " + System.getenv("PATH"));
        }
        else {

            /* FIX: error message is general */
            response.getWriter().println("Not in path");

        }
    }

    /* good2() reverses the bodies in the if statement */
    private void good2(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        if(IO.staticFive==5)
        {
            /* FIX: error message is general */
            response.getWriter().println("Not in path");
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            /* FLAW: system information exposed */
            response.getWriter().println("Not in path: " + System.getenv("PATH"));

        }

    }

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        good1(request, response);
        good2(request, response);
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
