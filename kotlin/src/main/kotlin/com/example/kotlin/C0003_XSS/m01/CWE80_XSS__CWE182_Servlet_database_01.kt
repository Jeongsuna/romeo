/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE80_XSS__CWE182_Servlet_database_01.java
Label Definition File: CWE80_XSS__CWE182_Servlet.label.xml
Template File: sources-sink-01.tmpl.java
*/
/*
* @description
* CWE: 80 Cross Site Scripting (XSS)
* BadSource: database Read data from a database
* GoodSource: A hardcoded string
* BadSink:  Display of data in web page after using replaceAll() to remove script tags, which will still allow XSS (CWE 182: Collapse of Data into Unsafe Value)
* Flow Variant: 01 Baseline
*
* */
package com.example.kotlin.C0003_XSS.m01

import testcasesupport.AbstractTestCaseServlet
import testcasesupport.IO
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException
import java.util.logging.Level
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class CWE80_XSS__CWE182_Servlet_database_01 : AbstractTestCaseServlet() {
    /* uses badsource and badsink */
    @Throws(Throwable::class)
    override fun bad(request: HttpServletRequest, response: HttpServletResponse) {
        lateinit var data: String
        data = "" /* Initialize data */

        /* Read data from a database */
        run {
            lateinit var connection: Connection
            lateinit var preparedStatement: PreparedStatement
            lateinit var resultSet: ResultSet
            try {
                /* setup the connection */
                connection = IO.getDBConnection()

                /* prepare and execute a (hardcoded) query */
                preparedStatement = connection.prepareStatement("select name from users where id=0")
                resultSet = preparedStatement.executeQuery()

                /* POTENTIAL FLAW: Read data from a database query resultset */
                data = resultSet.getString(1)
            } catch (exceptSql: SQLException) {
                IO.logger.log(Level.WARNING, "Error with SQL statement", exceptSql)
            } finally {
                /* Close database objects */
                try {
                    resultSet.close()
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql)
                }
                try {
                    preparedStatement.close()
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql)
                }
                try {
                    connection.close()
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql)
                }
            }
        }
        if (data != null) {
            /* POTENTIAL FLAW: Display of data in web page after using replaceAll() to remove script tags, which will still allow XSS with strings like <scr<script>ipt> (CWE 182: Collapse of Data into Unsafe Value) */
            response.writer.println("<br>bad(): data = " + data.replace("(<script>)".toRegex(), ""))
        }
    }

    @Throws(Throwable::class)
    override fun good(request: HttpServletRequest, response: HttpServletResponse) {
        goodG2B(request, response)
    }

    /* goodG2B() - uses goodsource and badsink */
    @Throws(Throwable::class)
    private fun goodG2B(request: HttpServletRequest, response: HttpServletResponse) {
        lateinit var data: String

        /* FIX: Use a hardcoded string */
        data = "foo"
        if (data != null) {
            /* POTENTIAL FLAW: Display of data in web page after using replaceAll() to remove script tags, which will still allow XSS with strings like <scr<script>ipt> (CWE 182: Collapse of Data into Unsafe Value) */
            response.writer.println("<br>bad(): data = " + data.replace("(<script>)".toRegex(), ""))
        }
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