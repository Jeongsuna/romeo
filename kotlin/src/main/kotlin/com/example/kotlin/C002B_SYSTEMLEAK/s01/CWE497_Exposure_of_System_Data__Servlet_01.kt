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
package com.example.kotlin.C002B_SYSTEMLEAK.s01

import testcasesupport.AbstractTestCaseServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import java.lang.*

class CWE497_Exposure_of_System_Data__Servlet_01 : AbstractTestCaseServlet() {
    @Throws(Throwable::class)
    override fun bad(request: HttpServletRequest, response: HttpServletResponse) {

        /* FLAW: system information exposed */
        response.writer.println("Not in path: " + System.getenv("PATH"))
    }

    @Throws(Throwable::class)
    override fun good(request: HttpServletRequest, response: HttpServletResponse) {
        good1(request, response)
    }

    @Throws(Throwable::class)
    private fun good1(request: HttpServletRequest, response: HttpServletResponse) {

        /* FIX: error message is general */
        response.writer.println("Not in path")
    }

    companion object {
        /* Below is the main(). It is only used when building this testcase on
       its own for testing or for building a binary to use in testing binary
       analysis tools. It is not used when compiling all the testcases as one
       application, which is how source code analysis tools are tested. */
        @Throws(ClassNotFoundException::class, InstantiationException::class, IllegalAccessException::class)
        @JvmStatic
        fun main(args: Array<String>) {
            mainFromParent(args)
        }
    }
}