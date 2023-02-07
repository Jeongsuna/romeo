/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE315_Plaintext_Storage_in_Cookie__Servlet_01.java
Label Definition File: CWE315_Plaintext_Storage_in_Cookie__Servlet.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 315 Storing plaintext data in a cookie
* BadSource:  Set data to credentials (without hashing or encryption)
* GoodSource: Set data to a hash of credentials
* Sinks:
*    GoodSink: Hash data before storing in cookie
*    BadSink : Store data directly in cookie
* Flow Variant: 01 Baseline
*
* */
package com.example.kotlin.C0015_SENDCLEAR.s01

import testcasesupport.AbstractTestCaseServlet
import java.io.FileNotFoundException
import java.io.PrintStream
import java.io.PrintWriter
import java.net.Socket
import java.util.logging.Level
import java.util.logging.Logger
import javax.crypto.Cipher
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class C0015_SENDCLEAR__Socket_write_01 : AbstractTestCaseServlet() {
    @Throws(Throwable::class)
    override fun bad(request: HttpServletRequest, response: HttpServletResponse) {
        try {
            val s = Socket("taranis", 4444)
            val o = PrintWriter(s.getOutputStream(), true)
            val password = request.getParameter("password")
            /* FLAW : CWE-319 */o.write(password)
        } catch (e: FileNotFoundException) {
            Logger.getLogger("xx").log(Level.ALL, "File not found")
        }
    }

    @Throws(Throwable::class)
    override fun good(request: HttpServletRequest, response: HttpServletResponse) {
        try {
            val s = Socket("taranis", 4444)
            val o = PrintStream(s.getOutputStream(), true)
            val c = Cipher.getInstance("AES/CBC/PKCS5Padding")
            val password = request.getParameter("password")
            val encPassword = c.update(password.toByteArray())
            o.write(encPassword, 0, encPassword.size)
        } catch (e: FileNotFoundException) {
            Logger.getLogger("xx").log(Level.ALL, "File not found")
        }
    }

    companion object {
        private const val CONNECT_STRING = "jdbc:ocl:orcl"

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