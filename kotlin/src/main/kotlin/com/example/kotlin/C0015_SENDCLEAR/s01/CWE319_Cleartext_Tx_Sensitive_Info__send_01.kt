/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE319_Cleartext_Tx_Sensitive_Info__send_01.java
Label Definition File: CWE319_Cleartext_Tx_Sensitive_Info__send.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 319 Cleartext Transmission of Sensitive Information
* BadSource:  Establish data as a password
* GoodSource: Use a regular string (non-sensitive string)
* Sinks:
*    GoodSink: encrypted channel
*    BadSink : unencrypted channel
* Flow Variant: 01 Baseline
*
* */
package com.example.kotlin.C0015_SENDCLEAR.s01

import testcasesupport.AbstractTestCase
import testcasesupport.IO
import java.io.IOException
import java.io.PrintWriter
import java.net.PasswordAuthentication
import java.net.Socket
import java.util.logging.Level
import javax.net.ssl.SSLSocket
import javax.net.ssl.SSLSocketFactory

class CWE319_Cleartext_Tx_Sensitive_Info__send_01 : AbstractTestCase() {
    @Throws(Throwable::class)
    override fun bad() {
        lateinit var data: String

        /* INCIDENTAL: CWE-798 Use of Hard-coded Credentials */
        val credentials = PasswordAuthentication("user", "AP@ssw0rd".toCharArray())

        /* POTENTIAL FLAW: Set data to be a password, which can be transmitted over a non-secure
         * channel in the sink */
        data = String(credentials.password)
        lateinit var socket: Socket
        lateinit var writer: PrintWriter
        try {
            socket = Socket("remote_host", 1337)
            writer = PrintWriter(socket.getOutputStream(), true)
            /* POTENTIAL FLAW: sending data over an unencrypted (non-SSL) channel */
            writer.println(data)
        } catch (exceptIO: IOException) {
            IO.logger.log(Level.WARNING, "Error writing to the socket", exceptIO)
        } finally {
            writer.close()
            try {
                socket.close()
            } catch (exceptIO: IOException) {
                IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO)
            }
        }
    }

    @Throws(Throwable::class)
    override fun good() {
        goodG2B()
        goodB2G()
    }

    /* goodG2B() - use goodsource and badsink */
    @Throws(Throwable::class)
    private fun goodG2B() {
        lateinit var data: String

        /* FIX: Use a regular string (non-sensitive string) */
        data = "Hello World"
        lateinit var socket: Socket
        lateinit var writer: PrintWriter
        try {
            socket = Socket("remote_host", 1337)
            writer = PrintWriter(socket.getOutputStream(), true)
            /* POTENTIAL FLAW: sending data over an unencrypted (non-SSL) channel */
            writer.println(data)
        } catch (exceptIO: IOException) {
            IO.logger.log(Level.WARNING, "Error writing to the socket", exceptIO)
        } finally {
            writer.close()
            try {
                socket.close()
            } catch (exceptIO: IOException) {
                IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO)
            }
        }
    }

    /* goodB2G() - use badsource and goodsink */
    @Throws(Throwable::class)
    private fun goodB2G() {
        val data: String

        /* INCIDENTAL: CWE-798 Use of Hard-coded Credentials */
        val credentials = PasswordAuthentication("user", "AP@ssw0rd".toCharArray())

        /* POTENTIAL FLAW: Set data to be a password, which can be transmitted over a non-secure
         * channel in the sink */
        data = String(credentials.password)
        lateinit var sslsSocketFactory: SSLSocketFactory
        lateinit var sslSocket: SSLSocket
        lateinit var writer: PrintWriter
        try {
            sslsSocketFactory = SSLSocketFactory.getDefault() as SSLSocketFactory
            sslSocket = sslsSocketFactory.createSocket("remote_host", 1337) as SSLSocket
            writer = PrintWriter(sslSocket!!.outputStream, true)
            /* FIX: sending data over an SSL encrypted channel */
            writer.println(data)
        } catch (exceptIO: IOException) {
            IO.logger.log(Level.WARNING, "Error writing to the socket", exceptIO)
        } finally {
            writer.close()
            try {
                sslSocket.close()
            } catch (exceptIO: IOException) {
                IO.logger.log(Level.WARNING, "Error closing SSLSocket", exceptIO)
            }
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