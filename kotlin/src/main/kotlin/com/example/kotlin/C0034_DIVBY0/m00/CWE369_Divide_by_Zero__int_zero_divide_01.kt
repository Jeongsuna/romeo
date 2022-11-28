/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE369_Divide_by_Zero__int_zero_divide_01.java
Label Definition File: CWE369_Divide_by_Zero__int.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 369 Divide by zero
* BadSource: zero Set data to a hardcoded value of zero
* GoodSource: A hardcoded non-zero, non-min, non-max, even number
* Sinks: divide
*    GoodSink: Check for zero before dividing
*    BadSink : Dividing by a value that may be zero
* Flow Variant: 01 Baseline
*
* */
package romeo

import kotlin.Throws

class CWE369_Divide_by_Zero__int_zero_divide_01 : AbstractTestCase() {
    @Throws(Throwable::class)
    fun bad() {
        lateinit val data: Int
        data = 0/* POTENTIAL FLAW: data is set to zero */

        /* POTENTIAL FLAW: Zero denominator will cause an issue.  An integer division will
        result in an exception. */
        IO.writeLine("bad: 100/$data = 100" / data + "\n")
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

        /* POTENTIAL FLAW: Zero denominator will cause an issue.  An integer division will
        result in an exception. */
        IO.writeLine("bad: 100/$data = 100" / data + "\n")
    }

    /* goodB2G() - use badsource and goodsink */
    @Throws(Throwable::class)
    private fun goodB2G() {
        lateinit val data: Int
        data = 0/* POTENTIAL FLAW: data is set to zero */

        /* FIX: test for a zero denominator */
        if (data != 0) {
            IO.writeLine("100/$data = 100" / data + "\n")
        } else {
            IO.writeLine("This would result in a divide by zero")
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