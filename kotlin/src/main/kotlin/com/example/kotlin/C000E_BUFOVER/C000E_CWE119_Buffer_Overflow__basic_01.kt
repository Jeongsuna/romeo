package romeo
/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE129_Improper_Validation_of_Array_Index__database_array_read_no_check_01.java
Label Definition File: CWE129_Improper_Validation_of_Array_Index.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 129 Improper Validation of Array Index
* BadSource: database Read data from a database
* GoodSource: A hardcoded non-zero, non-min, non-max, even number
* Sinks: array_read_no_check
*    GoodSink: Read from array after verifying index
*    BadSink : Read from array without any verification of index
* Flow Variant: 01 Baseline
*
* */
import java.sql.Connection

class C000E_CWE119_Buffer_Overflow__basic_01 {
    @Throws(Throwable::class)
    fun bad() {
        lateinit var data: Int
        data = Integer.MIN_VALUE /* Initialize data */

        /* Read data from a database */
        run {
            lateinit var connection: Connection = null
            lateinit var preparedStatement: PreparedStatement = null
            lateinit var resultSet: ResultSet = null
            try {
                /* setup the connection */
                connection = IO.getDBConnection()

                /* prepare and execute a (hardcoded) query */
                preparedStatement = connection.prepareStatement("select name from users where id=0")
                resultSet = preparedStatement.executeQuery()

                /* POTENTIAL FLAW: Read data from a database query resultset */
                val stringNumber: String = resultSet.getString(1)
                if (stringNumber != null) /* avoid NPD incidental warnings */ {
                    try {
                        data = Integer.parseInt(stringNumber.trim())
                    } catch (exceptNumberFormat: NumberFormatException) {
                        IO.logger.log(
                            Level.WARNING,
                            "Number format exception parsing data from string",
                            exceptNumberFormat
                        )
                    }
                }
            } catch (exceptSql: SQLException) {
                IO.logger.log(Level.WARNING, "Error with SQL statement", exceptSql)
            } finally {
                /* Close database objects */
                try {
                    if (resultSet != null) {
                        resultSet.close()
                    }
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql)
                }
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close()
                    }
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql)
                }
                try {
                    if (connection != null) {
                        connection.close()
                    }
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql)
                }
            }
        }

        /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
        val array = intArrayOf(0, 1, 2, 3, 4)

        /* POTENTIAL FLAW: Attempt to read from array at location data, which may be outside the array bounds */if (data >= 0) IO.writeLine(
            array[data]
        )
    }

    @Throws(Throwable::class)
    fun good() {
        goodG2B()
        goodB2G()
    }

    /* goodG2B() - use goodsource and badsink */
    @Throws(Throwable::class)
    private fun goodG2B() {
        lateinit val data: Int

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        data = 2

        /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
        val array = intArrayOf(0, 1, 2, 3, 4)

        /* POTENTIAL FLAW: Attempt to read from array at location data, which may be outside the array bounds */
        IO.writeLine(
            array[data]
        )
    }

    /* goodB2G() - use badsource and goodsink */
    @Throws(Throwable::class)
    private fun goodB2G() {
        lateinit var data: Int
        data = Integer.MIN_VALUE /* Initialize data */

        /* Read data from a database */
        run {
            lateinit var connection: Connection = null
            lateinit var preparedStatement: PreparedStatement = null
            lateinit var resultSet: ResultSet = null
            try {
                /* setup the connection */
                connection = IO.getDBConnection()

                /* prepare and execute a (hardcoded) query */
                preparedStatement = connection.prepareStatement("select name from users where id=0")
                resultSet = preparedStatement.executeQuery()

                /* POTENTIAL FLAW: Read data from a database query resultset */
                val stringNumber: String = resultSet.getString(1)
                if (stringNumber != null) /* avoid NPD incidental warnings */ {
                    try {
                        data = Integer.parseInt(stringNumber.trim())
                    } catch (exceptNumberFormat: NumberFormatException) {
                        IO.logger.log(
                            Level.WARNING,
                            "Number format exception parsing data from string",
                            exceptNumberFormat
                        )
                    }
                }
            } catch (exceptSql: SQLException) {
                IO.logger.log(Level.WARNING, "Error with SQL statement", exceptSql)
            } finally {
                /* Close database objects */
                try {
                    if (resultSet != null) {
                        resultSet.close()
                    }
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql)
                }
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close()
                    }
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql)
                }
                try {
                    if (connection != null) {
                        connection.close()
                    }
                } catch (exceptSql: SQLException) {
                    IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql)
                }
            }
        }

        /* Need to ensure that the array is of size > 3  and < 101 due to the GoodSource and the large_fixed BadSource */
        val array = intArrayOf(0, 1, 2, 3, 4)

        /* FIX: Verify index before reading from array at location data */
        if (data >= 0 && data < array.size) {
            IO.writeLine(array[data])
        } else {
            IO.writeLine("Array index out of bounds")
        }
    }
}