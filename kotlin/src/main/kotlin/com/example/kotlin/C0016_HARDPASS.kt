package romeo

import com.example.kotlin.Util
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.sql.*

class C0016_HARDPASS {
    @Throws(Throwable::class)
    fun bad() {
        val data: String

        /* FLAW: Set data to a hardcoded string */
        data = "7e5tc4s3"
        var connection: Connection? = null
        var preparedStatement: PreparedStatement? = null
        var resultSet: ResultSet? = null
        if (data != null) {
            try {
                /* POTENTIAL FLAW: data used as password in database connection */
                connection = DriverManager.getConnection("data-url", "root", data)
                preparedStatement = connection.prepareStatement("select * from test_table")
                resultSet = preparedStatement.executeQuery()
            } catch (exceptSql: SQLException) {
                Util.writeLine("WARNING: Error with database connection")
            } finally {
                try {
                    resultSet?.close()
                } catch (exceptSql: SQLException) {
                    Util.writeLine("WARNING: Error closing ResultSet")
                }
                try {
                    preparedStatement?.close()
                } catch (exceptSql: SQLException) {
                    Util.writeLine("WARNING: Error closing PreparedStatement")
                }
                try {
                    connection?.close()
                } catch (exceptSql: SQLException) {
                    Util.writeLine("WARNING: Error closing Connection")
                }
            }
        }
    }

    @Throws(Throwable::class)
    private fun good() {
        var data: String
        data = "" /* init data */

        /* FIX: Read data from the console using readLine() */
        try {
            val readerInputStream = InputStreamReader(System.`in`, "UTF-8")
            val readerBuffered = BufferedReader(readerInputStream)

            /* POTENTIAL FLAW: Read data from the console using readLine */
            data = readerBuffered.readLine()
        } catch (exceptIO: IOException) {
            Util.writeLine("WARNING: Error with stream reading")
        }

        /* NOTE: Tools may report a flaw here because readerBuffered and readerInputStream are not closed.  Unfortunately, closing those will close System.in, which will cause any future attempts to read from the console to fail and throw an exception */
        var connection: Connection? = null
        var preparedStatement: PreparedStatement? = null
        var resultSet: ResultSet? = null
        if (data != null) {
            try {
                /* POTENTIAL FLAW: data used as password in database connection */
                connection = DriverManager.getConnection("data-url", "root", data)
                preparedStatement = connection.prepareStatement("select * from test_table")
                resultSet = preparedStatement.executeQuery()
            } catch (exceptSql: SQLException) {
                Util.writeLine("WARNING: Error with database connection")
            } finally {
                try {
                    resultSet?.close()
                } catch (exceptSql: SQLException) {
                    Util.writeLine("WARNING: Error closing ResultSet")
                }
                try {
                    preparedStatement?.close()
                } catch (exceptSql: SQLException) {
                    Util.writeLine("WARNING: Error closing PreparedStatement")
                }
                try {
                    connection?.close()
                } catch (exceptSql: SQLException) {
                    Util.writeLine("WARNING: Error closing Connection")
                }
            }
        }
    }
}