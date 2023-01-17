/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE78_OS_Command_Injection__console_readLine_01.java
Label Definition File: CWE78_OS_Command_Injection.label.xml
Template File: sources-sink-01.tmpl.java
*/
/*
* @description
* CWE: 78 OS Command Injection
* BadSource: console_readLine Read data from the console using readLine()
* GoodSource: A hardcoded string
* BadSink: exec dynamic command execution with Runtime.getRuntime().exec()
* Flow Variant: 01 Baseline
*
* */
package com.example.kotlin.C0004_CMDI.m01

import testcasesupport.AbstractTestCase
import testcasesupport.IO
import java.io.BufferedReader

import java.io.InputStreamReader

import java.io.IOException
import java.util.*


import java.util.logging.Level


class CWE78_OS_Command_Injection__console_readLine_01 : AbstractTestCase() {
    /* uses badsource and badsink */
    @Throws(Throwable::class)
    override fun bad() {
        lateinit var data: String
        data = "" /* Initialize data */
        run {
            var readerInputStream: InputStreamReader? = null
            var readerBuffered: BufferedReader? = null

            /* read user input from console with readLine */
            try {
            readerInputStream = InputStreamReader(System.`in`, "UTF-8")
            readerBuffered = BufferedReader(readerInputStream)

            /* POTENTIAL FLAW: Read data from the console using readLine */
                data = readerBuffered.readLine()
        } catch (exceptIO: IOException) {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO)
        } finally {
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
        }
        }
        /* NOTE: Tools may report a flaw here because buffread and isr are not closed.  Unfortunately, closing those will close System.in, which will cause any future attempts to read from the console to fail and throw an exception */
        val osCommand: String
        osCommand = if (System.getProperty("os.name").lowercase(Locale.getDefault()).indexOf("win") >= 0) {
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
    override fun good() {
        goodG2B()
    }

    /* goodG2B() - uses goodsource and badsink */
    @Throws(Throwable::class)
    private fun goodG2B() {
        val data: String

        /* FIX: Use a hardcoded string */
        data = "foo"
        val osCommand: String
        osCommand = if (System.getProperty("os.name").lowercase(Locale.getDefault()).indexOf("win") >= 0) {
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