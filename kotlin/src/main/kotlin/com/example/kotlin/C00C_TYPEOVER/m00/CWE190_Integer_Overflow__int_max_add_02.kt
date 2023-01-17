/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__int_max_add_02.java
Label Definition File: CWE190_Integer_Overflow__int.label.xml
Template File: sources-sinks-02.tmpl.java
*/
/*
* @description
* CWE: 190 Integer Overflow
* BadSource: max Set data to the maximum value for int
* GoodSource: A hardcoded non-zero, non-min, non-max, even number
* Sinks: add
*    GoodSink: Ensure there will not be an overflow before adding 1 to data
*    BadSink : Add 1 to data, which can cause an overflow
* Flow Variant: 02 Control flow: if(true) and if(false)
*
* */
package com.example.kotlin.C00C_TYPEOVER.m00

import testcasesupport.AbstractTestCase
import testcasesupport.IO

class CWE190_Integer_Overflow__int_max_add_02 : AbstractTestCase() {
    @Throws(Throwable::class)
    override fun bad() {
        val data: Int = if (true) {
            /* POTENTIAL FLAW: Use the maximum value for this type */
            Integer.MAX_VALUE
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            0
        }
        if (true) {
            /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */

            /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
            val result = (data + 1)
            IO.writeLine("result: $result")
        }
    }

    /* goodG2B1() - use goodsource and badsink by changing first true to false */
    @Throws(Throwable::class)
    private fun goodG2B1() {
        val data: Int = if (false) {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            0
        } else {

            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            2
        }
        if (true) {
            /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
            val result = (data + 1)
            IO.writeLine("result: $result")
        }
    }

    /* goodG2B2() - use goodsource and badsink by reversing statements in first if */
    @Throws(Throwable::class)
    private fun goodG2B2() {
        val data: Int = if (true) {
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            2
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            0
        }
        if (true) {
            /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
            val result = (data + 1)
            IO.writeLine("result: $result")
        }
    }

    /* goodB2G1() - use badsource and goodsink by changing second true to false */
    @Throws(Throwable::class)
    private fun goodB2G1() {
        val data: Int = if (true) {
            /* POTENTIAL FLAW: Use the maximum value for this type */
            Integer.MAX_VALUE
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            0
        }
        if (false) {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string")
        } else {

            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Integer.MAX_VALUE) {
                val result = (data + 1)
                IO.writeLine("result: $result")
            } else {
                IO.writeLine("data value is too large to perform addition.")
            }
        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing statements in second if  */
    @Throws(Throwable::class)
    private fun goodB2G2() {
        val data: Int = if (true) {
            /* POTENTIAL FLAW: Use the maximum value for this type */
            Integer.MAX_VALUE
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            0
        }
        if (true) {
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Integer.MAX_VALUE) {
                val result = (data + 1)
                IO.writeLine("result: $result")
            } else {
                IO.writeLine("data value is too large to perform addition.")
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
        fun main(args: Array<String?>?) {
            mainFromParent(args)
        }
    }
}