/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE643_Xpath_Injection__connect_tcp_01.java
Label Definition File: CWE643_Xpath_Injection.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 643 Xpath Injection
* BadSource: connect_tcp Read data using an outbound tcp connection
* GoodSource: A hardcoded string
* Sinks:
*    GoodSink: validate input through StringEscapeUtils
*    BadSink : user input is used without validate
* Flow Variant: 01 Baseline
*
* */
package com.example.kotlin.C0008_XPATHI.m01

import org.apache.commons.lang3.StringEscapeUtils
import org.xml.sax.InputSource
import testcasesupport.AbstractTestCase
import testcasesupport.AbstractTestCaseBase
import testcasesupport.IO
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.Socket
import java.util.*
import java.util.logging.Level
import javax.xml.xpath.XPathConstants
import javax.xml.xpath.XPathFactory
import javax.xml.xpath.XPath
class CWE643_Xpath_Injection__connect_tcp_01 : AbstractTestCase() {
    @Throws(Throwable::class)
    override fun bad() {
        lateinit var data: String
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
                    if (readerBuffered != null) {
                        readerBuffered.close()
                    }
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
        lateinit var xmlFile: String
        xmlFile = if (System.getProperty("os.name").lowercase(Locale.getDefault()).indexOf("win") >= 0) {
            /* running on Windows */
            "\\src\\testcases\\CWE643_Xpath Injection\\CWE643_Xpath_Injection__Helper.xml"
        } else {
            /* running on non-Windows */
            "./src/testcases/CWE643_Xpath Injection/CWE643_Xpath_Injection__Helper.xml"
        }
        if (data != null) {
            /* assume username||password as source */
            val tokens = data.split("||".toRegex())
            if (tokens.size < 2) {
                return
            }
            val username = tokens[0]
            val password = tokens[1]
            /* build xpath */
            val xPath:XPath = XPathFactory.newInstance().newXPath()
            val inputXml = InputSource(xmlFile)
            /* INCIDENTAL: CWE180 Incorrect Behavior Order: Validate Before Canonicalize
             *     The user input should be canonicalized before validation. */
            /* POTENTIAL FLAW: user input is used without validate */
            val query = "//users/user[name/text()='" + username +
                    "' and pass/text()='" + password + "']" +
                    "/secret/text()"
            val secret = xPath.evaluate(query, inputXml, XPathConstants.STRING)
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

        /* FIX: Use a hardcoded string */
        data = "foo"
        lateinit var xmlFile: String
        xmlFile = if (System.getProperty("os.name").lowercase(Locale.getDefault()).indexOf("win") >= 0) {
            /* running on Windows */
            "\\src\\testcases\\CWE643_Xpath Injection\\CWE643_Xpath_Injection__Helper.xml"
        } else {
            /* running on non-Windows */
            "./src/testcases/CWE643_Xpath Injection/CWE643_Xpath_Injection__Helper.xml"
        }
        if (data != null) {
            /* assume username||password as source */
            val tokens = data.split("||".toRegex())
            if (tokens.size < 2) {
                return
            }
            val username = tokens[0]
            val password = tokens[1]
            /* build xpath */
            val xPath: XPath = XPathFactory.newInstance().newXPath()
            val inputXml = InputSource(xmlFile)
            /* INCIDENTAL: CWE180 Incorrect Behavior Order: Validate Before Canonicalize
             *     The user input should be canonicalized before validation. */
            /* POTENTIAL FLAW: user input is used without validate */
            val query = "//users/user[name/text()='" + username +
                    "' and pass/text()='" + password + "']" +
                    "/secret/text()"
            val secret = xPath.evaluate(query, inputXml, XPathConstants.STRING)
        }
    }

    /* goodB2G() - use badsource and goodsink */
    @Throws(Throwable::class)
    private fun goodB2G() {
        lateinit var data: String
        data = "" /* Initialize data */

        /* Read data using an outbound tcp connection */
        run {
            lateinit var socket: Socket
            lateinit var readerBuffered: BufferedReader
            lateinit var readerInputStream: InputStreamReader
            try {
                /* Read data using an outbound tcp connection */
                socket = Socket("host.example.org", 39544)

                /* read input from socket */readerInputStream = InputStreamReader(socket.getInputStream(), "UTF-8")
                readerBuffered = BufferedReader(readerInputStream)

                /* POTENTIAL FLAW: Read data using an outbound tcp connection */
                data = readerBuffered.readLine()
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
        lateinit var xmlFile: String
        xmlFile = if (System.getProperty("os.name").lowercase(Locale.getDefault()).indexOf("win") >= 0) {
            /* running on Windows */
            "\\src\\testcases\\CWE643_Xpath Injection\\CWE643_Xpath_Injection__Helper.xml"
        } else {
            /* running on non-Windows */
            "./src/testcases/CWE643_Xpath Injection/CWE643_Xpath_Injection__Helper.xml"
        }
        if (data != null) {
            /* assume username||password as source */
            val tokens = data.split("||".toRegex())
            if (tokens.size < 2) {
                return
            }
            /* FIX: validate input using StringEscapeUtils */
            val username: String = StringEscapeUtils.escapeXml(
                tokens[0]
            )
            val password: String = StringEscapeUtils.escapeXml(tokens[1])
            /* build xpath */
            val xPath: XPath = XPathFactory.newInstance().newXPath()
            val inputXml = InputSource(xmlFile)
            val query = "//users/user[name/text()='" + username +
                    "' and pass/text()='" + password + "']" +
                    "/secret/text()"
            val secret = xPath.evaluate(query, inputXml, XPathConstants.STRING)
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
            AbstractTestCaseBase.mainFromParent(args)
        }
    }
}