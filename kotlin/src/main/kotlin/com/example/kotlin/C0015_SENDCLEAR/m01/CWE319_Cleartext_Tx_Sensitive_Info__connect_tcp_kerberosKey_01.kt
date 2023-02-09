/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE319_Cleartext_Tx_Sensitive_Info__connect_tcp_kerberosKey_01.java
Label Definition File: CWE319_Cleartext_Tx_Sensitive_Info.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 319 Cleartext Transmission of Sensitive Information
* BadSource: connect_tcp Read password using an outbound tcp connection
* GoodSource: Set password to a hardcoded value (one that was not sent over the network)
* Sinks: kerberosKey
*    GoodSink: Decrypt password before using in KerberosKey()
*    BadSink : Use password directly in KerberosKey()
* Flow Variant: 01 Baseline
*
* */
package com.example.kotlin.C0015_SENDCLEAR.m01

import testcasesupport.AbstractTestCase
import testcasesupport.IO
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.Socket
import java.util.logging.Level
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import javax.security.auth.kerberos.KerberosKey
import javax.security.auth.kerberos.KerberosPrincipal

class CWE319_Cleartext_Tx_Sensitive_Info__connect_tcp_kerberosKey_01 : AbstractTestCase() {
    @Throws(Throwable::class)
    override fun bad() {
        var password: String = "" /* init password */

        /* Read data using an outbound tcp connection */
        run {
            lateinit var socket: Socket
            lateinit var readerBuffered: BufferedReader
            lateinit var readerInputStream: InputStreamReader
            try {
                /* Read data using an outbound tcp connection */
                socket = Socket("host.example.org", 39544)

                /* read input from socket */

                /* POTENTIAL FLAW: Read password using an outbound tcp connection */
                readerInputStream = InputStreamReader(socket.getInputStream(), "UTF-8")
                readerBuffered = BufferedReader(readerInputStream)
                password = readerBuffered.readLine()
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
        if (password != null) {
            val principal = KerberosPrincipal("test")
            /* POTENTIAL FLAW: Use password directly in KerberosKey() */
            val key = KerberosKey(principal, password.toCharArray(), null)
            IO.writeLine(key.toString())
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
        lateinit var password: String

        /* FIX: Use a hardcoded password as the password (it was not sent over the network) */
        /* INCIDENTAL FLAW: CWE-259 Hard Coded Password */
        password = "Password1234!"
        if (password != null) {
            val principal = KerberosPrincipal("test")
            /* POTENTIAL FLAW: Use password directly in KerberosKey() */
            val key = KerberosKey(principal, password.toCharArray(), null)
            IO.writeLine(key.toString())
        }
    }

    /* goodB2G() - use badsource and goodsink */
    @Throws(Throwable::class)
    private fun goodB2G() {
        lateinit var password: String
        password = "" /* init password */

        /* Read data using an outbound tcp connection */
        run {
            lateinit var socket: Socket
            lateinit var readerBuffered: BufferedReader
            lateinit var readerInputStream: InputStreamReader
            try {
                /* Read data using an outbound tcp connection */
                socket = Socket("host.example.org", 39544)

                /* read input from socket */

                /* POTENTIAL FLAW: Read password using an outbound tcp connection */
                readerInputStream = InputStreamReader(socket.getInputStream(), "UTF-8")
                readerBuffered = BufferedReader(readerInputStream)
                password = readerBuffered.readLine()
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
        if (password != null) {
            val principal = KerberosPrincipal("test")
            /* FIX: Decrypt password before using in KerberosKey() */
            run {
                val aesCipher = Cipher.getInstance("AES")
                /* INCIDENTAL: CWE-321: Use of Hard-coded Cryptographic Key */
                val secretKeySpec = SecretKeySpec("ABCDEFGHABCDEFGH".toByteArray(charset("UTF-8")), "AES")
                aesCipher.init(Cipher.DECRYPT_MODE, secretKeySpec)
                password = aesCipher.doFinal(password.toByteArray(charset("UTF-8"))).toString()
            }
            val key = KerberosKey(principal, password.toCharArray(), null)
            IO.writeLine(key.toString())
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