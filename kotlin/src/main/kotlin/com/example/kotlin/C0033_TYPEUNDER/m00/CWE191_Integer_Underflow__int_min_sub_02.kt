/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE191_Integer_Underflow__int_min_sub_02.java
Label Definition File: CWE191_Integer_Underflow__int.label.xml
Template File: sources-sinks-02.tmpl.java
*/
/*
* @description
* CWE: 191 Integer Underflow
* BadSource: min Set data to the minimum value for int
* GoodSource: A hardcoded non-zero, non-min, non-max, even number
* Sinks: sub
*    GoodSink: Ensure there will not be an underflow before subtracting 1 from data
*    BadSink : Subtract 1 from data, which can cause an Underflow
* Flow Variant: 02 Control flow: if(true) and if(false)
*
* */
package romeo

import kotlin.Throws

class CWE191_Integer_Underflow__int_min_sub_02 : AbstractTestCase() {
    @Throws(Throwable::class)
    fun bad() {
        lateinit val data: Int
        data = if (true) {
            /* POTENTIAL FLAW: Use the maximum value for this type */
            Integer.MIN_VALUE
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            0
        }
        if (true) {
            /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
            IO.writeLine("result: ${(data - 1)}")
        }
    }

    /* goodG2B1() - use goodsource and badsink by changing first true to false */
    @Throws(Throwable::class)
    private fun goodG2B1() {
        lateinit val data: Int
        data = if (false) {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            0
        } else {

            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            2
        }
        if (true) {
            /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
            IO.writeLine("result: ${(data - 1)}")
        }
    }

    /* goodG2B2() - use goodsource and badsink by reversing statements in first if */
    @Throws(Throwable::class)
    private fun goodG2B2() {
        lateinit val data: Int
        data = if (true) {
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            2
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            0
        }
        if (true) {
            /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
            IO.writeLine("result: ${(data - 1)}")
        }
    }

    /* goodB2G1() - use badsource and goodsink by changing second true to false */
    @Throws(Throwable::class)
    private fun goodB2G1() {
        lateinit val data: Int
        data = if (true) {
            /* POTENTIAL FLAW: Use the maximum value for this type */
            Integer.MIN_VALUE
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
            if (data > Integer.MIN_VALUE) {
                IO.writeLine("result: ${(data - 1)}")
            } else {
                IO.writeLine("data value is too small to perform subtraction.")
            }
        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing statements in second if  */
    @Throws(Throwable::class)
    private fun goodB2G2() {
        lateinit val data: Int
        data = if (true) {
            /* POTENTIAL FLAW: Use the maximum value for this type */
            Integer.MIN_VALUE
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            0
        }
        if (true) {
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data > Integer.MIN_VALUE) {
                IO.writeLine("result: ${(data - 1)}")
            } else {
                IO.writeLine("data value is too small to perform subtraction.")
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