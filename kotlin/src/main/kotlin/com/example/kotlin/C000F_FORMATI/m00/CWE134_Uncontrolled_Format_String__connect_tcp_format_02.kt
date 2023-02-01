/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE134_Uncontrolled_Format_String__connect_tcp_format_02.java
Label Definition File: CWE134_Uncontrolled_Format_String.label.xml
Template File: sources-sinks-02.tmpl.java
*/
/*
* @description
* CWE: 134 Uncontrolled Format String
* BadSource: connect_tcp Read data using an outbound tcp connection
* GoodSource: A hardcoded string
* Sinks: format
*    GoodSink: dynamic formatted stdout with string defined
*    BadSink : dynamic formatted stdout without validation
* Flow Variant: 02 Control flow: if(true) and if(false)
*
* */
package com.example.kotlin.C000F_FORMATI.m00

import testcasesupport.AbstractTestCase
import testcasesupport.IO
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.Socket
import java.util.logging.Level

class CWE134_Uncontrolled_Format_String__connect_tcp_format_02 : AbstractTestCase() {
    @Throws(Throwable::class)
    override fun bad() {
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
        if (true) {
            if (!data.equals("null")) {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data)
            }
        }
    }

    /* goodG2B1() - use goodsource and badsink by changing first true to false */
    @Throws(Throwable::class)
    private fun goodG2B1() {
        lateinit var data: String
        data = if (false) {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            null.toString()
        } else {

            /* FIX: Use a hardcoded string */
            "foo"
        }
        if (true) {
            if (!data.equals("null")) {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data)
            }
        }
    }

    /* goodG2B2() - use goodsource and badsink by reversing statements in first if */
    @Throws(Throwable::class)
    private fun goodG2B2() {
        lateinit var data: String
        data = if (true) {
            /* FIX: Use a hardcoded string */
            "foo"
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            null.toString()
        }
        if (true) {
            if (!data.equals("null")) {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.format(data)
            }
        }
    }

    /* goodB2G1() - use badsource and goodsink by changing second true to false */
    @Throws(Throwable::class)
    private fun goodB2G1() {
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
        if (false) {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string")
        } else {
            if (!data.equals("null")) {
                /* FIX: explicitly defined string formatting */
                System.out.format("%s%n", data)
            }
        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing statements in second if  */
    @Throws(Throwable::class)
    private fun goodB2G2() {
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
        if (true) {
            if (!data.equals("null")) {
                /* FIX: explicitly defined string formatting */
                System.out.format("%s%n", data)
            }
        }
    }

    @Throws(Throwable::class)
    override fun good() {
        goodG2B1()
        goodG2B2()
        goodB2G1()
        goodB2G2()
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