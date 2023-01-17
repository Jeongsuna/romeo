/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__int_max_add_01.java
Label Definition File: CWE190_Integer_Overflow__int.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 190 Integer Overflow
* BadSource: max Set data to the maximum value for int
* GoodSource: A hardcoded non-zero, non-min, non-max, even number
* Sinks: add
*    GoodSink: Ensure there will not be an overflow before adding 1 to data
*    BadSink : Add 1 to data, which can cause an overflow
* Flow Variant: 01 Baseline
*
* */
package com.example.kotlin.C00C_TYPEOVER.m00

import testcasesupport.AbstractTestCase
import testcasesupport.IO
import kotlin.Throws

class CWE190_Integer_Overflow__int_max_add_01 : AbstractTestCase() {
    @Throws(Throwable::class)
    override fun bad() {
        val data: Int

        /* POTENTIAL FLAW: Use the maximum value for this type */
        data = Integer.MAX_VALUE

        /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
        IO.writeLine("result: ${(data + 1)}")
    }

    @Throws(Throwable::class)
    override fun good() {
        goodG2B()
        goodB2G()
    }

    /* goodG2B() - use goodsource and badsink */
    @Throws(Throwable::class)
    private fun goodG2B() {
        var data: Int

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        data = 2

        /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
        IO.writeLine("result: ${(data + 1)}")
    }

    /* goodB2G() - use badsource and goodsink */
    @Throws(Throwable::class)
    private fun goodB2G() {
        var data: Int

        /* POTENTIAL FLAW: Use the maximum value for this type */
        data = Integer.MAX_VALUE

        /* FIX: Add a check to prevent an overflow from occurring */
        if (data < Integer.MAX_VALUE) {
            IO.writeLine("result: ${(data + 1)}")
        } else {
            IO.writeLine("data value is too large to perform addition.")
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