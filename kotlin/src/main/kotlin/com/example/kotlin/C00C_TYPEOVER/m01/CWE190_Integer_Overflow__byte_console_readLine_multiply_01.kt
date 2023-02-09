/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__byte_console_readLine_multiply_01.java
Label Definition File: CWE190_Integer_Overflow.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 190 Integer Overflow
* BadSource: console_readLine Read data from the console using readLine
* GoodSource: A hardcoded non-zero, non-min, non-max, even number
* Sinks: multiply
*    GoodSink: Ensure there will not be an overflow before multiplying data by 2
*    BadSink : If data is positive, multiply by 2, which can cause an overflow
* Flow Variant: 01 Baseline
*
* */
package com.example.kotlin.C00C_TYPEOVER.m01

import testcasesupport.AbstractTestCase
import testcasesupport.IO
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.logging.Level

class CWE190_Integer_Overflow__byte_console_readLine_multiply_01 : AbstractTestCase() {
    @Throws(Throwable::class)
    override fun bad() {
        var data: Byte

        /* init data */
        data = -1

        /* POTENTIAL FLAW: Read data from console with readLine*/
        var readerBuffered: BufferedReader? = null
        var readerInputStream: InputStreamReader? = null
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
        if (data > 0) /* ensure we won't have an underflow */ {
            /* POTENTIAL FLAW: if (data*2) > Byte.MAX_VALUE, this will overflow */
            val result = (data * 2).toByte()
            IO.writeLine("result: $result")
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
        val data: Byte

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        data = 2
        if (data > 0) /* ensure we won't have an underflow */ {
            /* POTENTIAL FLAW: if (data*2) > Byte.MAX_VALUE, this will overflow */
            val result = (data * 2).toByte()
            IO.writeLine("result: $result")
        }
    }

    /* goodB2G() - use badsource and goodsink */
    @Throws(Throwable::class)
    private fun goodB2G() {
        var data: Byte

        /* init data */
        data = -1

        /* POTENTIAL FLAW: Read data from console with readLine*/
        var readerBuffered: BufferedReader? = null
        var readerInputStream: InputStreamReader? = null
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
        if (data > 0) /* ensure we won't have an underflow */ {
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Byte.MAX_VALUE / 2) {
                val result = (data * 2).toByte()
                IO.writeLine("result: $result")
            } else {
                IO.writeLine("data value is too large to perform multiplication.")
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
private fun Any.parseByte(trim: String): Byte {

    return 0
}