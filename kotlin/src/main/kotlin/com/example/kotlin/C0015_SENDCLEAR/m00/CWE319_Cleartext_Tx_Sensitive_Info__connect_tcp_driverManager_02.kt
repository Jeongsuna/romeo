/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE319_Cleartext_Tx_Sensitive_Info__connect_tcp_driverManager_02.java
Label Definition File: CWE319_Cleartext_Tx_Sensitive_Info.label.xml
Template File: sources-sinks-02.tmpl.java
*/
/*
* @description
* CWE: 319 Cleartext Transmission of Sensitive Information
* BadSource: connect_tcp Read password using an outbound tcp connection
* GoodSource: Set password to a hardcoded value (one that was not sent over the network)
* Sinks: driverManager
*    GoodSink: Decrypt the password from the source before using it in database connection
*    BadSink : Use password directly from source in database connection
* Flow Variant: 02 Control flow: if(true) and if(false)
*
* */
package com.example.kotlin.C0015_SENDCLEAR.m00

import testcasesupport.AbstractTestCase
import testcasesupport.IO
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.Socket
import java.sql.*
import java.util.logging.Level
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import java.sql.DriverManager

class CWE319_Cleartext_Tx_Sensitive_Info__connect_tcp_driverManager_02 : AbstractTestCase() {
    @Throws(Throwable::class)
    override fun bad() {
        var password: String?
        if (true) {
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
                        socket?.close()
                    } catch (exceptIO: IOException) {
                        IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO)
                    }
                }
            }
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure password is inititialized before the Sink to avoid compiler errors */
            password = null
        }
        if (true) {
            lateinit var connection: Connection
            lateinit var preparedStatement: PreparedStatement
            lateinit var resultSet: ResultSet
            try {
                /* POTENTIAL FLAW: use password directly in getConnection() */
                connection = DriverManager.getConnection("data-url", "root", password)
                preparedStatement = connection.prepareStatement("select * from test_table")
                resultSet = preparedStatement.executeQuery()
            } catch (exceptSql: SQLException) {
                IO.logger.log(Level.WARNING, "Error with database connection", exceptSql)
            } finally {
                try {
                    resultSet.close()
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql)
                }
                try {
                    preparedStatement.close()
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql)
                }
                try {
                    connection.close()
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql)
                }
            }
        }
    }

    /* goodG2B1() - use goodsource and badsink by changing first true to false */
    @Throws(Throwable::class)
    private fun goodG2B1() {
        val password: String?
        password = if (false) {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure password is inititialized before the Sink to avoid compiler errors */
            null
        } else {

            /* FIX: Use a hardcoded password as the password (it was not sent over the network) */
            /* INCIDENTAL FLAW: CWE-259 Hard Coded Password */
            "Password1234!"
        }
        if (true) {
            lateinit var connection: Connection
            lateinit var preparedStatement: PreparedStatement
            lateinit var resultSet: ResultSet
            try {
                /* POTENTIAL FLAW: use password directly in getConnection() */
                connection = DriverManager.getConnection("data-url", "root", password)
                preparedStatement = connection.prepareStatement("select * from test_table")
                resultSet = preparedStatement.executeQuery()
            } catch (exceptSql: SQLException) {
                IO.logger.log(Level.WARNING, "Error with database connection", exceptSql)
            } finally {
                try {
                    resultSet.close()
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql)
                }
                try {
                    preparedStatement.close()
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql)
                }
                try {
                    connection.close()
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql)
                }
            }
        }
    }

    /* goodG2B2() - use goodsource and badsink by reversing statements in first if */
    @Throws(Throwable::class)
    private fun goodG2B2() {
        val password: String?
        password = if (true) {
            /* FIX: Use a hardcoded password as the password (it was not sent over the network) */
            /* INCIDENTAL FLAW: CWE-259 Hard Coded Password */
            "Password1234!"
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure password is inititialized before the Sink to avoid compiler errors */
            null
        }
        if (true) {
            lateinit var connection: Connection
            lateinit var preparedStatement: PreparedStatement
            lateinit var resultSet: ResultSet
            try {
                /* POTENTIAL FLAW: use password directly in getConnection() */
                connection = DriverManager.getConnection("data-url", "root", password)
                preparedStatement = connection.prepareStatement("select * from test_table")
                resultSet = preparedStatement.executeQuery()
            } catch (exceptSql: SQLException) {
                IO.logger.log(Level.WARNING, "Error with database connection", exceptSql)
            } finally {
                try {
                    resultSet.close()
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql)
                }
                try {
                    preparedStatement.close()
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql)
                }
                try {
                    connection.close()
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql)
                }
            }
        }
    }

    /* goodB2G1() - use badsource and goodsink by changing second true to false */
    @Throws(Throwable::class)
    private fun goodB2G1() {
        var password: String?
        if (true) {
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
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure password is inititialized before the Sink to avoid compiler errors */
            password = null
        }
        if (false) {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string")
        } else {
            if (password != null) {
                /* FIX: Decrypt password before using in getConnection() */
                run {
                    val aesCipher = Cipher.getInstance("AES")
                    /* INCIDENTAL: CWE-321: Use of Hard-coded Cryptographic Key */
                    val secretKeySpec = SecretKeySpec("ABCDEFGHABCDEFGH".toByteArray(charset("UTF-8")), "AES")
                    aesCipher.init(Cipher.DECRYPT_MODE, secretKeySpec)
                    password = aesCipher.doFinal(password!!.toByteArray(charset("UTF-8"))).toString()
                }
                lateinit var connection: Connection
                lateinit var preparedStatement: PreparedStatement
                lateinit var resultSet: ResultSet
                try {
                    /* POTENTIAL FLAW: use password directly in getConnection() */
                    connection = DriverManager.getConnection("data-url", "root", password)
                    preparedStatement = connection.prepareStatement("select * from test_table")
                    resultSet = preparedStatement.executeQuery()
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error with database connection", exceptSql)
                } finally {
                    try {
                        resultSet.close()
                    } catch (exceptSql: SQLException) {
                        IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql)
                    }
                    try {
                        preparedStatement.close()
                    } catch (exceptSql: SQLException) {
                        IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql)
                    }
                    try {
                        connection.close()
                    } catch (exceptSql: SQLException) {
                        IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql)
                    }
                }
            }
        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing statements in second if  */
    @Throws(Throwable::class)
    private fun goodB2G2() {
        var password: String?
        if (true) {
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
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure password is inititialized before the Sink to avoid compiler errors */
            password = null
        }
        if (true) {
            if (password != null) {
                /* FIX: Decrypt password before using in getConnection() */
                run {
                    val aesCipher = Cipher.getInstance("AES")
                    /* INCIDENTAL: CWE-321: Use of Hard-coded Cryptographic Key */
                    val secretKeySpec = SecretKeySpec("ABCDEFGHABCDEFGH".toByteArray(charset("UTF-8")), "AES")
                    aesCipher.init(Cipher.DECRYPT_MODE, secretKeySpec)
                    password = aesCipher.doFinal(password!!.toByteArray(charset("UTF-8"))).toString()
                }
                lateinit var connection: Connection
                lateinit var preparedStatement: PreparedStatement
                lateinit var resultSet: ResultSet
                try {
                    /* POTENTIAL FLAW: use password directly in getConnection() */
                    connection = DriverManager.getConnection("data-url", "root", password)
                    preparedStatement = connection.prepareStatement("select * from test_table")
                    resultSet = preparedStatement.executeQuery()
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error with database connection", exceptSql)
                } finally {
                    try {
                        resultSet.close()
                    } catch (exceptSql: SQLException) {
                        IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql)
                    }
                    try {
                        preparedStatement.close()
                    } catch (exceptSql: SQLException) {
                        IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql)
                    }
                    try {
                        connection.close()
                    } catch (exceptSql: SQLException) {
                        IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql)
                    }
                }
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