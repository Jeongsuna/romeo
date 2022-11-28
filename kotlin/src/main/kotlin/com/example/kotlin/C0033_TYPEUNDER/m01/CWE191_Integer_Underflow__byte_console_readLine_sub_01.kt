/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE191_Integer_Underflow__byte_console_readLine_sub_01.java
Label Definition File: CWE191_Integer_Underflow.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 191 Integer Underflow
* BadSource: console_readLine Read data from the console using readLine
* GoodSource: A hardcoded non-zero, non-min, non-max, even number
* Sinks: sub
*    GoodSink: Ensure there will not be an underflow before subtracting 1 from data
*    BadSink : Subtract 1 from data, which can cause an Underflow
* Flow Variant: 01 Baseline
*
* */
package romeo

import java.io.BufferedReader

class CWE191_Integer_Underflow__byte_console_readLine_sub_01 : AbstractTestCase() {
    @Throws(Throwable::class)
    fun bad() {
        lateinit var data: Byte

        /* init data */
        data = -1

        /* POTENTIAL FLAW: Read data from console with readLine*/
        lateinit var readerBuffered: BufferedReader = null
        lateinit var readerInputStream: InputStreamReader = null
        try {
            readerInputStream = InputStreamReader(System.in, "UTF-8")
            readerBuffered = BufferedReader(readerInputStream)
            val stringNumber: String = readerBuffered.readLine()
            if (stringNumber != null) {
                data = Byte.parseByte(stringNumber.trim())
            }
        } catch (exceptIO: IOException) {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO)
        } catch (exceptNumberFormat: NumberFormatException) {
            IO.logger.log(Level.WARNING, "Error with number parsing", exceptNumberFormat)
        } finally {
            /* clean up stream reading objects */
            try {
                if (readerBuffered != null) {
                    readerBuffered.close()
                }
            } catch (exceptIO: IOException) {
                IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO)
            } finally {
                try {
                    if (readerInputStream != null) {
                        readerInputStream.close()
                    }
                } catch (exceptIO: IOException) {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO)
                }
            }
        }

        /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
        val result = (data - 1).toByte()
        IO.writeLine("result: $result")
    }

    @Throws(Throwable::class)
    fun good() {
        goodG2B()
        goodB2G()
    }

    /* goodG2B() - use goodsource and badsink */
    @Throws(Throwable::class)
    private fun goodG2B() {
        lateinit val data: Byte

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        data = 2

        /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
        val result = (data - 1).toByte()
        IO.writeLine("result: $result")
    }

    /* goodB2G() - use badsource and goodsink */
    @Throws(Throwable::class)
    private fun goodB2G() {
        lateinit var data: Byte

        /* init data */
        data = -1

        /* POTENTIAL FLAW: Read data from console with readLine*/
        lateinit var readerBuffered: BufferedReader = null
        lateinit var readerInputStream: InputStreamReader = null
        try {
            readerInputStream = InputStreamReader(System.`in`, "UTF-8")
            readerBuffered = BufferedReader(readerInputStream)
            val stringNumber: String = readerBuffered.readLine()
            if (stringNumber != null) {
                data = Byte.parseByte(stringNumber.trim())
            }
        } catch (exceptIO: IOException) {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO)
        } catch (exceptNumberFormat: NumberFormatException) {
            IO.logger.log(Level.WARNING, "Error with number parsing", exceptNumberFormat)
        } finally {
            /* clean up stream reading objects */
            try {
                if (readerBuffered != null) {
                    readerBuffered.close()
                }
            } catch (exceptIO: IOException) {
                IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO)
            } finally {
                try {
                    if (readerInputStream != null) {
                        readerInputStream.close()
                    }
                } catch (exceptIO: IOException) {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO)
                }
            }
        }

        /* FIX: Add a check to prevent an overflow from occurring */
        if (data > Byte.MIN_VALUE) {
            val result = (data - 1).toByte()
            IO.writeLine("result: $result")
        } else {
            IO.writeLine("data value is too small to perform subtraction.")
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