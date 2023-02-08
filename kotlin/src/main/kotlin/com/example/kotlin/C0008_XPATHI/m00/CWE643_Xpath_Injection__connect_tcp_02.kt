/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE643_Xpath_Injection__connect_tcp_02.java
Label Definition File: CWE643_Xpath_Injection.label.xml
Template File: sources-sinks-02.tmpl.java
*/
/*
* @description
* CWE: 643 Xpath Injection
* BadSource: connect_tcp Read data using an outbound tcp connection
* GoodSource: A hardcoded string
* Sinks:
*    GoodSink: validate input through StringEscapeUtils
*    BadSink : user input is used without validate
* Flow Variant: 02 Control flow: if(true) and if(false)
*
* */
package com.example.kotlin.C0008_XPATHI.m00

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
import javax.xml.xpath.XPath
import javax.xml.xpath.XPathConstants
import javax.xml.xpath.XPathFactory
class CWE643_Xpath_Injection__connect_tcp_02 : AbstractTestCase() {
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
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null.toString()
        }
        if (true) {
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
                val tokens = data!!.split("||".toRegex())
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
                val tokens = data!!.split("||".toRegex())
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
                val secret = xPath.evaluate(query, inputXml, XPathConstants.STRING)// as String
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
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = null.toString()
        }
        if (true) {
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
                val tokens = data!!.split("||".toRegex())
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
            AbstractTestCaseBase.mainFromParent(args)
        }
    }
}