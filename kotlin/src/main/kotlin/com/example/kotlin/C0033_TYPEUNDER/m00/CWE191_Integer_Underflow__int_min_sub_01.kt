/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE191_Integer_Underflow__int_min_sub_01.java
Label Definition File: CWE191_Integer_Underflow__int.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 191 Integer Underflow
* BadSource: min Set data to the minimum value for int
* GoodSource: A hardcoded non-zero, non-min, non-max, even number
* Sinks: sub
*    GoodSink: Ensure there will not be an underflow before subtracting 1 from data
*    BadSink : Subtract 1 from data, which can cause an Underflow
* Flow Variant: 01 Baseline
*
* */
package romeo

import kotlin.Throws

class CWE191_Integer_Underflow__int_min_sub_01 : AbstractTestCase() {
    @Throws(Throwable::class)
    fun bad() {
        lateinit val data: Int

        /* POTENTIAL FLAW: Use the maximum value for this type */
        data = Integer.MIN_VALUE

        /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
        IO.writeLine("result: ${(data - 1)}")
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

        /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
        IO.writeLine("result: ${(data - 1)}")
    }

    /* goodB2G() - use badsource and goodsink */
    @Throws(Throwable::class)
    private fun goodB2G() {
        lateinit val data: Int

        /* POTENTIAL FLAW: Use the maximum value for this type */
        data = Integer.MIN_VALUE

        /* FIX: Add a check to prevent an overflow from occurring */
        if (data > Integer.MIN_VALUE) {
            IO.writeLine("result: ${(data - 1)}")
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