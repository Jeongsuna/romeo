/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE78_OS_Command_Injection__connect_tcp_02.java
Label Definition File: CWE78_OS_Command_Injection.label.xml
Template File: sources-sink-02.tmpl.java
*/
/*
* @description
* CWE: 78 OS Command Injection
* BadSource: connect_tcp Read data using an outbound tcp connection
* GoodSource: A hardcoded string
* BadSink: exec dynamic command execution with Runtime.getRuntime().exec()
* Flow Variant: 02 Control flow: if(true) and if(false)
*
* */
package romeo

import java.io.BufferedReader

import java.io.InputStreamReader

import java.io.IOException
import java.lang.Runtime
import java.net.Socket


import java.util.logging.Level


class CWE78_OS_Command_Injection__connect_tcp_02 : AbstractTestCase() {
    /* uses badsource and badsink */
    @Throws(Throwable::class)
    fun bad() {
        lateinit var data: String
        if (true) {
            data = "" /* Initialize data */
            /* Read data using an outbound tcp connection */
            run {
                lateinit var socket: Socket = null
                lateinit var readerBuffered: BufferedReader = null
                lateinit var readerInputStream: InputStreamReader = null
                try {
                    /* Read data using an outbound tcp connection */
                    socket = Socket("host.example.org", 39544)
                    /* read input from socket */readerInputStream = InputStreamReader(socket.getInputStream(), "UTF-8")
                    readerBuffered = BufferedReader(readerInputStream)
                    /* POTENTIAL FLAW: Read data using an outbound tcp connection */data = readerBuffered.readLine()
                } catch (exceptIO: IOException) {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO)
                } finally {
                    /* clean up stream reading objects */
                    try {
                        if (readerBuffered != null) {
                            readerBuffered.close()
                        }
                    } catch (exceptIO: IOException) {
                        IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO)
                    }
                    try {
                        if (readerInputStream != null) {
                            readerInputStream.close()
                        }
                    } catch (exceptIO: IOException) {
                        IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO)
                    }

                    /* clean up socket objects */try {
                        if (socket != null) {
                            socket.close()
                        }
                    } catch (exceptIO: IOException) {
                        IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO)
                    }
                }
            }
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null
        }
        lateinit val osCommand: String
        osCommand = if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
            /* running on Windows */
            "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir "
        } else {
            /* running on non-Windows */
            "/bin/ls "
        }

        /* POTENTIAL FLAW: command injection */
        val process: Process = Runtime.getRuntime().exec(osCommand + data)
        process.waitFor()
    }

    /* goodG2B1() - use goodsource and badsink by changing true to false */
    @Throws(Throwable::class)
    private fun goodG2B1() {
        lateinit val data: String
        data = if (false) {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            null
        } else {

            /* FIX: Use a hardcoded string */
            "foo"
        }
        lateinit val osCommand: String
        osCommand = if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
            /* running on Windows */
            "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir "
        } else {
            /* running on non-Windows */
            "/bin/ls "
        }

        /* POTENTIAL FLAW: command injection */
        val process: Process = Runtime.getRuntime().exec(osCommand + data)
        process.waitFor()
    }

    /* goodG2B2() - use goodsource and badsink by reversing statements in if */
    @Throws(Throwable::class)
    private fun goodG2B2() {
        lateinit val data: String
        data = if (true) {
            /* FIX: Use a hardcoded string */
            "foo"
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            null
        }
        lateinit val osCommand: String
        osCommand = if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
            /* running on Windows */
            "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir "
        } else {
            /* running on non-Windows */
            "/bin/ls "
        }

        /* POTENTIAL FLAW: command injection */
        val process: Process = Runtime.getRuntime().exec(osCommand + data)
        process.waitFor()
    }

    @Throws(Throwable::class)
    fun good() {
        goodG2B1()
        goodG2B2()
    }

    companion object {
        /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the testcases as one
     * application, which is how source code analysis tools are tested.
     */
        @Throws(ClassNotFoundException::class, InstantiationException::class, IllegalAccessException::class)
        fun main(args: Array<String?>?) {
            mainFromParent(args)
        }
    }
}