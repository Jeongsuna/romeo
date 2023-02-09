/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE80_XSS__CWE182_Servlet_connect_tcp_02.java
Label Definition File: CWE80_XSS__CWE182_Servlet.label.xml
Template File: sources-sink-02.tmpl.java
*/
/*
* @description
* CWE: 80 Cross Site Scripting (XSS)
* BadSource: connect_tcp Read data using an outbound tcp connection
* GoodSource: A hardcoded string
* BadSink:  Display of data in web page after using replaceAll() to remove script tags, which will still allow XSS (CWE 182: Collapse of Data into Unsafe Value)
* Flow Variant: 02 Control flow: if(true) and if(false)
*
* */
package com.example.kotlin.C0003_XSS.m00

import testcasesupport.AbstractTestCaseServlet
import testcasesupport.IO
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.Socket
import java.util.logging.Level
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class CWE80_XSS__CWE182_Servlet_connect_tcp_02 : AbstractTestCaseServlet() {
    /* uses badsource and badsink */
    @Throws(Throwable::class)
    override fun bad(request: HttpServletRequest, response: HttpServletResponse) {
        lateinit var data: String
        if (true) {
            data = "" /* Initialize data */
            /* Read data using an outbound tcp connection */
            run {
                lateinit var socket: Socket
                lateinit var readerBuffered: BufferedReader
                lateinit var readerInputStream: InputStreamReader
                try {
                    /* Read data using an outbound tcp connection */
                    socket = Socket("host.example.org", 39544)
                    /* read input from socket */
                    readerInputStream = InputStreamReader(socket.getInputStream(), "UTF-8")
                    readerBuffered = BufferedReader(readerInputStream)
                    /* POTENTIAL FLAW: Read data using an outbound tcp connection */
                    data = readerBuffered.readLine()
                } catch (exceptIO: IOException) {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO)
                } finally {
                    /* clean up stream reading objects */
                    try {
                        readerBuffered.close()
                    } catch (exceptIO: IOException) {
                        IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO)
                    }
                    try {
                        readerInputStream.close()
                    } catch (exceptIO: IOException) {
                        IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO)
                    }

                    /* clean up socket objects */
                    try {
                        socket.close()
                    } catch (exceptIO: IOException) {
                        IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO)
                    }
                }
            }
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null.toString()
        }
        if (!data.equals("null")) {
            /* POTENTIAL FLAW: Display of data in web page after using replaceAll() to remove script tags, which will still allow XSS with strings like <scr<script>ipt> (CWE 182: Collapse of Data into Unsafe Value) */
            response.writer.println("<br>bad(): data = " + data!!.replace("(<script>)".toRegex(), ""))
        }
    }

    /* goodG2B1() - use goodsource and badsink by changing true to false */
    @Throws(Throwable::class)
    private fun goodG2B1(request: HttpServletRequest, response: HttpServletResponse) {
        lateinit var data: String
        data = if (false) {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            null.toString()
        } else {

            /* FIX: Use a hardcoded string */
            "foo"
        }
        if (!data.equals("null")) {
            /* POTENTIAL FLAW: Display of data in web page after using replaceAll() to remove script tags, which will still allow XSS with strings like <scr<script>ipt> (CWE 182: Collapse of Data into Unsafe Value) */
            response.writer.println("<br>bad(): data = " + data.replace("(<script>)".toRegex(), ""))
        }
    }

    /* goodG2B2() - use goodsource and badsink by reversing statements in if */
    @Throws(Throwable::class)
    private fun goodG2B2(request: HttpServletRequest, response: HttpServletResponse) {
        lateinit var data: String
        data = if (true) {
            /* FIX: Use a hardcoded string */
            "foo"
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            null.toString()
        }
        if (!data.equals("null")) {
            /* POTENTIAL FLAW: Display of data in web page after using replaceAll() to remove script tags, which will still allow XSS with strings like <scr<script>ipt> (CWE 182: Collapse of Data into Unsafe Value) */
            response.writer.println("<br>bad(): data = " + data.replace("(<script>)".toRegex(), ""))
        }
    }

    @Throws(Throwable::class)
    override fun good(request: HttpServletRequest, response: HttpServletResponse) {
        goodG2B1(request, response)
        goodG2B2(request, response)
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