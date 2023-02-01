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
package com.example.kotlin.C0014_STORECLEAR

import testcasesupport.AbstractTestCaseServlet
import java.security.MessageDigest
import javax.naming.InitialContext
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.sql.DataSource

class C0014_STORECLEAR__Servlet_01 : AbstractTestCaseServlet() {
    @Throws(Throwable::class)
    override fun bad(request: HttpServletRequest, response: HttpServletResponse) {
        val id = request.getParameter("id")
        val pwd = request.getParameter("pwd")
        val sql = (" insert into customer(id, pwd, name, ssn, zipcode, addr)"
                + " values (?, ?, ?, ?, ?, ?)")
        val ctx = InitialContext()
        val datasource = ctx.lookup(CONNECT_STRING) as DataSource
        val conn = datasource.connection
        val stmt = conn.prepareStatement(sql)
        stmt.setString(1, id)
        stmt.setString(2, pwd)
        /* FLAW: CWE-312 */
        stmt.executeUpdate()
    }

    @Throws(Throwable::class)
    override fun good(request: HttpServletRequest, response: HttpServletResponse) {
        val salt: Byte = 0x01
        val id = request.getParameter("id")
        val pwd = request.getParameter("pwd")
        val digest = MessageDigest.getInstance("SHA-256")
        digest.reset()
        digest.update(salt)
        val pwdDigested = digest.digest(pwd.toByteArray())
        val sql = (" insert into customer(id, pwd, name, ssn, zipcode, addr)"
                + " values (?, ?, ?, ?, ?, ?)")
        val ctx = InitialContext()
        val datasource = ctx.lookup(CONNECT_STRING) as DataSource
        val conn = datasource.connection
        val stmt = conn.prepareStatement(sql)
        stmt.setString(1, id)
        stmt.setString(2, pwdDigested.toString())
        stmt.executeUpdate()
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