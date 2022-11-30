/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE89_SQL_Injection__connect_tcp_execute_02.java
Label Definition File: CWE89_SQL_Injection.label.xml
Template File: sources-sinks-02.tmpl.java
*/
/*
* @description
* CWE: 89 SQL Injection
* BadSource: connect_tcp Read data using an outbound tcp connection
* GoodSource: A hardcoded string
* Sinks: execute
*    GoodSink: Use prepared statement and execute (properly)
*    BadSink : data concatenated into SQL statement used in execute(), which could result in SQL Injection
* Flow Variant: 02 Control flow: if(true) and if(false)
*
* */
package romeo

import java.io.BufferedReader

class CWE89_SQL_Injection__connect_tcp_execute_02 : AbstractTestCase() {
    @Throws(Throwable::class)
    fun bad() {
        lateinit var data: String
        if (true) {
            data = "" /* Initialize data */
            /* Read data using an outbound tcp connection */
            run {
                var socket: Socket? = null
                var readerBuffered: BufferedReader? = null
                var readerInputStream: InputStreamReader? = null
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
        if (true) {
            lateinit var dbConnection: Connection = null
            lateinit var sqlStatement: Statement = null
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
    }

    /* goodG2B1() - use goodsource and badsink by changing first true to false */
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
        if (true) {
            lateinit var dbConnection: Connection = null
            lateinit var sqlStatement: Statement = null
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
    }

    /* goodG2B2() - use goodsource and badsink by reversing statements in first if */
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
        if (true) {
            lateinit var dbConnection: Connection = null
            lateinit var sqlStatement: Statement = null
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
    }

    /* goodB2G1() - use badsource and goodsink by changing second true to false */
    @Throws(Throwable::class)
    private fun goodB2G1() {
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
        if (false) {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string")
        } else {
            lateinit var dbConnection: Connection = null
            lateinit var sqlStatement: PreparedStatement = null
            try {
                /* FIX: Use prepared statement and execute (properly) */
                dbConnection = IO.getDBConnection()
                sqlStatement =
                    dbConnection.prepareStatement("insert into users (status) values ('updated') where name=?")
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
    }

    /* goodB2G2() - use badsource and goodsink by reversing statements in second if  */
    @Throws(Throwable::class)
    private fun goodB2G2() {
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
        if (true) {
            lateinit var dbConnection: Connection = null
            lateinit var sqlStatement: PreparedStatement = null
            try {
                /* FIX: Use prepared statement and execute (properly) */
                dbConnection = IO.getDBConnection()
                sqlStatement =
                    dbConnection.prepareStatement("insert into users (status) values ('updated') where name=?")
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
    }

    @Throws(Throwable::class)
    fun good() {
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
        fun main(args: Array<String?>?) {
            mainFromParent(args)
        }
    }
}