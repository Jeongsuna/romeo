/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE89_SQL_Injection__connect_tcp_executeBatch_01.java
Label Definition File: CWE89_SQL_Injection.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 89 SQL Injection
* BadSource: connect_tcp Read data using an outbound tcp connection
* GoodSource: A hardcoded string
* Sinks: executeBatch
*    GoodSink: Use prepared statement and executeBatch (properly)
*    BadSink : data concatenated into SQL statement used in executeBatch(), which could result in SQL Injection
* Flow Variant: 01 Baseline
*
* */
package romeo

import java.io.BufferedReader

class CWE89_SQL_Injection__connect_tcp_executeBatch_01 : AbstractTestCase() {
    @Throws(Throwable::class)
    fun bad() {
        lateinit var data: String
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
                    if (readerInputStream != null) {
                        readerInputStream.close()
                    }
                } catch (exceptIO: IOException) {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO)
                }

                /* clean up socket objects */
                try {
                    if (socket != null) {
                        socket.close()
                    }
                } catch (exceptIO: IOException) {
                    IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO)
                }
            }
        }
        if (data != null) {
            val names: Array<String> = data.split("-")
            var successCount = 0
            lateinit var dbConnection: Connection = null
            lateinit var sqlStatement: Statement = null
            try {
                dbConnection = IO.getDBConnection()
                sqlStatement = dbConnection.createStatement()
                for (i in names.indices) {
                    /* POTENTIAL FLAW: data concatenated into SQL statement used in executeBatch(), which could result in SQL Injection */
                    sqlStatement.addBatch("update users set hitcount=hitcount+1 where name='" + names[i] + "'")
                }
                val resultsArray: IntArray = sqlStatement.executeBatch()
                for (i in names.indices) {
                    if (resultsArray[i] > 0) {
                        successCount++
                    }
                }
                IO.writeLine("Succeeded in " + successCount + " out of " + names.size + " queries.")
            } catch (exceptSql: SQLException) {
                IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql)
            } finally {
                try {
                    if (sqlStatement != null) {
                        sqlStatement.close()
                    }
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing Statament", exceptSql)
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
    }

    @Throws(Throwable::class)
    fun good() {
        goodG2B()
        goodB2G()
    }

    /* goodG2B() - use goodsource and badsink */
    @Throws(Throwable::class)
    private fun goodG2B() {
        lateinit val data: String

        /* FIX: Use a hardcoded string */
        data = "foo"
        if (data != null) {
            val names: Array<String> = data.split("-")
            var successCount = 0
            lateinit var dbConnection: Connection = null
            lateinit var sqlStatement: Statement = null
            try {
                dbConnection = IO.getDBConnection()
                sqlStatement = dbConnection.createStatement()
                for (i in names.indices) {
                    /* POTENTIAL FLAW: data concatenated into SQL statement used in executeBatch(), which could result in SQL Injection */
                    sqlStatement.addBatch("update users set hitcount=hitcount+1 where name='" + names[i] + "'")
                }
                val resultsArray: IntArray = sqlStatement.executeBatch()
                for (i in names.indices) {
                    if (resultsArray[i] > 0) {
                        successCount++
                    }
                }
                IO.writeLine("Succeeded in " + successCount + " out of " + names.size + " queries.")
            } catch (exceptSql: SQLException) {
                IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql)
            } finally {
                try {
                    if (sqlStatement != null) {
                        sqlStatement.close()
                    }
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing Statament", exceptSql)
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
    }

    /* goodB2G() - use badsource and goodsink */
    @Throws(Throwable::class)
    private fun goodB2G() {
        var data: String
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

                /* clean up socket objects */
                try {
                    if (socket != null) {
                        socket.close()
                    }
                } catch (exceptIO: IOException) {
                    IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO)
                }
            }
        }
        if (data != null) {
            val names: Array<String> = data.split("-")
            var successCount = 0
            lateinit var dbConnection: Connection = null
            lateinit var sqlStatement: PreparedStatement = null
            try {
                /* FIX: Use prepared statement and executeBatch (properly) */
                dbConnection = IO.getDBConnection()
                sqlStatement = dbConnection.prepareStatement("update users set hitcount=hitcount+1 where name=?")
                for (i in names.indices) {
                    sqlStatement.setString(1, names[i])
                    sqlStatement.addBatch()
                }
                val resultsArray: IntArray = sqlStatement.executeBatch()
                for (i in names.indices) {
                    if (resultsArray[i] > 0) {
                        successCount++
                    }
                }
                IO.writeLine("Succeeded in " + successCount + " out of " + names.size + " queries.")
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