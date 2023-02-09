package testcasesupport

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.util.*
import java.util.logging.Logger

object IOKotlin {

    /* fill in these parameters if you want to be able to actually connect
    * to a database
    */
    private val dbUrl = ""
    private val dbUsername = ""
    private val dbPassword = ""

    val logger = Logger.getLogger("testcases")

    fun writeString(str: String?) {
        print(str)
    }

    fun writeLine(line: String?) {
        println(line)
    }

    fun writeLine(intNumber: Int) {
        writeLine(String.format("%02d", intNumber))
    }

    fun writeLine(longNumber: Long) {
        writeLine(String.format("%02d", longNumber))
    }

    fun writeLine(doubleNumber: Double) {
        writeLine(String.format("%02f", doubleNumber))
    }

    fun writeLine(floatNumber: Float) {
        writeLine(String.format("%02f", floatNumber))
    }

    fun writeLine(shortNumber: Short) {
        writeLine(String.format("%02d", shortNumber))
    }

    fun writeLine(byteHex: Byte) {
        writeLine(String.format("%02x", byteHex))
    }

    /* use this method to get a database connection for use in SQL
    * Injection and other test cases that use a database.
    */
    @Throws(SQLException::class)
    fun getDBConnection(): Connection? {
        return DriverManager.getConnection(dbUrl, dbUsername, dbPassword)
    }

    /* The variables below are declared "final", so a tool doing whole
    program analysis should be able to identify that reads of these
    will always return their initialized values. */
    val STATIC_FINAL_TRUE = true
    val STATIC_FINAL_FALSE = false
    val STATIC_FINAL_FIVE = 5

    /* The variables below are not defined as "final", but are never
    assigned any other value, so a tool doing whole program analysis
    should be able to identify that reads of these will always return
    their initialized values. */
    var staticTrue = true
    var staticFalse = false
    var staticFive = 5

    fun staticReturnsTrue(): Boolean {
        return true
    }

    fun staticReturnsFalse(): Boolean {
        return false
    }

    fun staticReturnsTrueOrFalse(): Boolean {
        return Random().nextBoolean()
    }

    /* Turns array of bytes into string.  Taken from:
    http://java.sun.com/developer/technicalArticles/Security/AES/AES_v1.html */
    fun toHex(byteBuffer: ByteArray): String? {
        val strBuffer = StringBuffer(byteBuffer.size * 2)
        var i: Int
        i = 0
        while (i < byteBuffer.size) {
            if (byteBuffer[i].toInt() and 0xff < 0x10) {
                strBuffer.append("0")
            }
            strBuffer.append(java.lang.Long.toString((byteBuffer[i].toInt() and 0xff).toLong(), 16))
            i++
        }
        return strBuffer.toString()
    }
}
