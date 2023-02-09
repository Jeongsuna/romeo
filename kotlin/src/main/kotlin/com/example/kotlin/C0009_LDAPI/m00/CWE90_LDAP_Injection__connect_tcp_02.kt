/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE90_LDAP_Injection__connect_tcp_02.java
Label Definition File: CWE90_LDAP_Injection.label.xml
Template File: sources-sink-02.tmpl.java
*/
/*
* @description
* CWE: 90 LDAP Injection
* BadSource: connect_tcp Read data using an outbound tcp connection
* GoodSource: A hardcoded string
* BadSink:  data concatenated into LDAP search, which could result in LDAP Injection
* Flow Variant: 02 Control flow: if(true) and if(false)
*
* */
package com.example.kotlin.C0009_LDAPI.m00

import testcasesupport.AbstractTestCase
import testcasesupport.IO
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.Socket
import java.util.*
import java.util.logging.Level
import javax.naming.Context
import javax.naming.NamingEnumeration
import javax.naming.NamingException
import javax.naming.directory.Attribute
import javax.naming.directory.DirContext
import javax.naming.directory.InitialDirContext

class CWE90_LDAP_Injection__connect_tcp_02 : AbstractTestCase() {
    /* uses badsource and badsink */
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
                        socket?.close()
                    } catch (exceptIO: IOException) {
                        IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO)
                    }
                }
            }
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            data = ""
        }
        val environmentHashTable = Hashtable<String, String>()
        environmentHashTable[Context.INITIAL_CONTEXT_FACTORY] = "com.sun.jndi.ldap.LdapCtxFactory"
        environmentHashTable[Context.PROVIDER_URL] = "ldap://localhost:389"
        lateinit var directoryContext: DirContext
        try {
            directoryContext = InitialDirContext(environmentHashTable)
            /* POTENTIAL FLAW: data concatenated into LDAP search, which could result in LDAP Injection */
            val search = "(cn=$data)"
            val answer = directoryContext.search("", search, null)
            while (answer.hasMore()) {
                val searchResult = answer.next()
                val attributes = searchResult.attributes
                val allAttributes: NamingEnumeration<*> = attributes.all
                while (allAttributes.hasMore()) {
                    val attribute = allAttributes.next() as Attribute
                    val allValues = attribute.all
                    while (allValues.hasMore()) {
                        IO.writeLine(" Value: " + allValues.next().toString())
                    }
                }
            }
        } catch (exceptNaming: NamingException) {
            IO.logger.log(Level.WARNING, "The LDAP service was not found or login failed.", exceptNaming)
        } finally {
            if (directoryContext != null) {
                try {
                    directoryContext.close()
                } catch (exceptNaming: NamingException) {
                    IO.logger.log(Level.WARNING, "Error closing DirContext", exceptNaming)
                }
            }
        }
    }

    /* goodG2B1() - use goodsource and badsink by changing true to false */
    @Throws(Throwable::class)
    private fun goodG2B1() {
        lateinit var data: String
        data = if (false) {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            ""
        } else {

            /* FIX: Use a hardcoded string */
            "foo"
        }
        val environmentHashTable = Hashtable<String, String>()
        environmentHashTable[Context.INITIAL_CONTEXT_FACTORY] = "com.sun.jndi.ldap.LdapCtxFactory"
        environmentHashTable[Context.PROVIDER_URL] = "ldap://localhost:389"
        lateinit var directoryContext: DirContext
        try {
            directoryContext = InitialDirContext(environmentHashTable)
            /* POTENTIAL FLAW: data concatenated into LDAP search, which could result in LDAP Injection */
            val search = "(cn=$data)"
            val answer = directoryContext.search("", search, null)
            while (answer.hasMore()) {
                val searchResult = answer.next()
                val attributes = searchResult.attributes
                val allAttributes: NamingEnumeration<*> = attributes.all
                while (allAttributes.hasMore()) {
                    val attribute = allAttributes.next() as Attribute
                    val allValues = attribute.all
                    while (allValues.hasMore()) {
                        IO.writeLine(" Value: " + allValues.next().toString())
                    }
                }
            }
        } catch (exceptNaming: NamingException) {
            IO.logger.log(Level.WARNING, "The LDAP service was not found or login failed.", exceptNaming)
        } finally {
            if (directoryContext != null) {
                try {
                    directoryContext.close()
                } catch (exceptNaming: NamingException) {
                    IO.logger.log(Level.WARNING, "Error closing DirContext", exceptNaming)
                }
            }
        }
    }

    /* goodG2B2() - use goodsource and badsink by reversing statements in if */
    @Throws(Throwable::class)
    private fun goodG2B2() {
        lateinit var data: String
        data = if (true) {
            /* FIX: Use a hardcoded string */
            "foo"
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            ""
        }
        val environmentHashTable = Hashtable<String, String>()
        environmentHashTable[Context.INITIAL_CONTEXT_FACTORY] = "com.sun.jndi.ldap.LdapCtxFactory"
        environmentHashTable[Context.PROVIDER_URL] = "ldap://localhost:389"
        lateinit var directoryContext: DirContext
        try {
            directoryContext = InitialDirContext(environmentHashTable)
            /* POTENTIAL FLAW: data concatenated into LDAP search, which could result in LDAP Injection */
            val search = "(cn=$data)"
            val answer = directoryContext.search("", search, null)
            while (answer.hasMore()) {
                val searchResult = answer.next()
                val attributes = searchResult.attributes
                val allAttributes: NamingEnumeration<*> = attributes.all
                while (allAttributes.hasMore()) {
                    val attribute = allAttributes.next() as Attribute
                    val allValues = attribute.all
                    while (allValues.hasMore()) {
                        IO.writeLine(" Value: " + allValues.next().toString())
                    }
                }
            }
        } catch (exceptNaming: NamingException) {
            IO.logger.log(Level.WARNING, "The LDAP service was not found or login failed.", exceptNaming)
        } finally {
            if (directoryContext != null) {
                try {
                    directoryContext.close()
                } catch (exceptNaming: NamingException) {
                    IO.logger.log(Level.WARNING, "Error closing DirContext", exceptNaming)
                }
            }
        }
    }

    @Throws(Throwable::class)
    override fun good() {
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
        @JvmStatic
        fun main(args: Array<String>) {
            mainFromParent(args)
        }
    }
}