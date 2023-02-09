/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE89_SQL_Injection__connect_tcp_execute_01.java
Label Definition File: CWE89_SQL_Injection.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 89 SQL Injection
* BadSource: connect_tcp Read data using an outbound tcp connection
* GoodSource: A hardcoded string
* Sinks: execute
*    GoodSink: Use prepared statement and execute (properly)
*    BadSink : data concatenated into SQL statement used in execute(), which could result in SQL Injection
* Flow Variant: 01 Baseline
*
* */
package com.example.kotlin.C0001_SQLI.m01

import testcasesupport.AbstractTestCase
import testcasesupport.IO
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.Socket
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.SQLException
import java.sql.Statement
import java.util.logging.Level

class CWE89_SQL_Injection__connect_tcp_execute_01 : AbstractTestCase() {
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
        lateinit var dbConnection: Connection
        lateinit var sqlStatement: Statement
        try {
            dbConnection = IO.getDBConnection()
            sqlStatement = dbConnection.createStatement()

            /* POTENTIAL FLAW: data concatenated into SQL statement used in execute(), which could result in SQL Injection */
            val result: Boolean = sqlStatement.execute(
                "insert into users (status) values ('updated') where name='$data'"
            )
            if (result) {
                IO.writeLine("Name, $data, updated successfully")
            } else {
                IO.writeLine("Unable to update records for user: $data")
            }
        } catch (exceptSql: SQLException) {
            IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql)
        } finally {
            try {
                if (sqlStatement != null) {
                    sqlStatement.close()
                }
            } catch (exceptSql: SQLException) {
                IO.logger.log(Level.WARNING, "Error closing Statement", exceptSql)
            }
            try {
                if (dbConnection != null) {
                    dbConnection.close()
                }
            } catch (exceptSql: SQLException) {
                IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql)
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
        val data: String?

        /* FIX: Use a hardcoded string */
        data = "foo"
        lateinit var dbConnection: Connection
        lateinit var sqlStatement: Statement
        try {
            dbConnection = IO.getDBConnection()
            sqlStatement = dbConnection.createStatement()

            /* POTENTIAL FLAW: data concatenated into SQL statement used in execute(), which could result in SQL Injection */
            val result: Boolean = sqlStatement.execute(
                "insert into users (status) values ('updated') where name='$data'"
            )
            if (result) {
                IO.writeLine("Name, $data, updated successfully")
            } else {
                IO.writeLine("Unable to update records for user: $data")
            }
        } catch (exceptSql: SQLException) {
            IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql)
        } finally {
            try {
                if (sqlStatement != null) {
                    sqlStatement.close()
                }
            } catch (exceptSql: SQLException) {
                IO.logger.log(Level.WARNING, "Error closing Statement", exceptSql)
            }
            try {
                if (dbConnection != null) {
                    dbConnection.close()
                }
            } catch (exceptSql: SQLException) {
                IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql)
            }
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
        lateinit var dbConnection: Connection
        lateinit var sqlStatement: PreparedStatement
        try {
            /* FIX: Use prepared statement and execute (properly) */
            dbConnection = IO.getDBConnection()
            sqlStatement = dbConnection.prepareStatement("insert into users (status) values ('updated') where name=?")
            sqlStatement.setString(1, data)
            val result: Boolean = sqlStatement.execute()
            if (result) {
                IO.writeLine("Name, $data, updated successfully")
            } else {
                IO.writeLine("Unable to update records for user: $data")
            }
        } catch (exceptSql: SQLException) {
            IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql)
        } finally {
            try {
                if (sqlStatement != null) {
                    sqlStatement.close()
                }
            } catch (exceptSql: SQLException) {
                IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql)
            }
            try {
                if (dbConnection != null) {
                    dbConnection.close()
                }
            } catch (exceptSql: SQLException) {
                IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql)
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
        fun main(args: Array<String?>?) {
            mainFromParent(args)
        }
    }
}