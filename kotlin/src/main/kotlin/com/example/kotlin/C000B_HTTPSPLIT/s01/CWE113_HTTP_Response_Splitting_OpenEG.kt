/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_01.java
Label Definition File: CWE113_HTTP_Response_Splitting.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 113 HTTP Response Splitting
* BadSource: URLConnection Read data from a web server with URLConnection
* GoodSource: A hardcoded string
* Sinks: setHeaderServlet
*    GoodSink: URLEncode input
*    BadSink : querystring to setHeader()
* Flow Variant: 01 Baseline
*
* */
package com.example.kotlin.C000B_HTTPSPLIT.s01

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import testcasesupport.AbstractTestCaseServletReturnString
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class CWE113_HTTP_Response_Splitting_OpenEG : AbstractTestCaseServletReturnString() {
    @RequestMapping(value = ["/test/csrf_test.do"])
    @ResponseBody
    @Throws(Throwable::class)
    override fun bad(request: HttpServletRequest, response: HttpServletResponse): String {
        val buffer = StringBuffer()
        val data = request.getParameter("data")
        /* FLAW  */
        buffer.append(data)
        return buffer.toString()
    }

    @Throws(Throwable::class)
    override fun good(request: HttpServletRequest, response: HttpServletResponse): String? {
        // TODO Auto-generated method stub
        return null
    }

    companion object {
        /* Below is the main(). It is only used when building this testcase on
	 * its own for testing or for building a binary to use in testing binary
	 * analysis tools. It is not used when compiling all the testcases as one
	 * application, which is how source code analysis tools are tested.
	 */
        @Throws(ClassNotFoundException::class, InstantiationException::class, IllegalAccessException::class)
        @JvmStatic
        fun main(args: Array<String>) {
            mainFromParent(args)
        }
    }
}