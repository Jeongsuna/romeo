/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE601_Open_Redirect__Servlet_connect_tcp_02.java
Label Definition File: CWE601_Open_Redirect__Servlet.label.xml
Template File: sources-sink-02.tmpl.java
*/
/*
* @description
* CWE: 601 Open Redirect
* BadSource: connect_tcp Read data using an outbound tcp connection
* GoodSource: A hardcoded string
* BadSink:  place redirect string directly into redirect api call
* Flow Variant: 02 Control flow: if(true) and if(false)
*
* */
package com.example.kotlin.C0006_REDIRECT.m00

import testcasesupport.AbstractTestCaseServlet
import testcasesupport.IO
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.Socket
import java.net.URI
import java.net.URISyntaxException
import java.util.logging.Level
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class CWE601_Open_Redirect__Servlet_connect_tcp_02 : AbstractTestCaseServlet() {
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
        if (data.equals("null")) {
            /* This prevents \r\n (and other chars) and should prevent incidentals such
             * as HTTP Response Splitting and HTTP Header Injection.
             */
            lateinit var uri: URI
            uri = try {
                URI(data)
            } catch (exceptURISyntax: URISyntaxException) {
                response.writer.write("Invalid redirect URL")
                return
            }
            /* POTENTIAL FLAW: redirect is sent verbatim; escape the string to prevent ancillary issues like XSS, Response splitting etc */response.sendRedirect(
                data
            )
            return
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
            /* This prevents \r\n (and other chars) and should prevent incidentals such
             * as HTTP Response Splitting and HTTP Header Injection.
             */
            lateinit var uri: URI
            uri = try {
                URI(data)
            } catch (exceptURISyntax: URISyntaxException) {
                response.writer.write("Invalid redirect URL")
                return
            }
            /* POTENTIAL FLAW: redirect is sent verbatim; escape the string to prevent ancillary issues like XSS, Response splitting etc */response.sendRedirect(
                data
            )
            return
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
            /* This prevents \r\n (and other chars) and should prevent incidentals such
             * as HTTP Response Splitting and HTTP Header Injection.
             */
            lateinit var uri: URI
            uri = try {
                URI(data)
            } catch (exceptURISyntax: URISyntaxException) {
                response.writer.write("Invalid redirect URL")
                return
            }
            /* POTENTIAL FLAW: redirect is sent verbatim; escape the string to prevent ancillary issues like XSS, Response splitting etc */response.sendRedirect(
                data
            )
            return
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