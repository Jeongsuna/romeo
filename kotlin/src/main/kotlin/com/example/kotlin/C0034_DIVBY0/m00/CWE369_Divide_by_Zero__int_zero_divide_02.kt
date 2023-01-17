/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE369_Divide_by_Zero__int_zero_divide_02.java
Label Definition File: CWE369_Divide_by_Zero__int.label.xml
Template File: sources-sinks-02.tmpl.java
*/
/*
* @description
* CWE: 369 Divide by zero
* BadSource: zero Set data to a hardcoded value of zero
* GoodSource: A hardcoded non-zero, non-min, non-max, even number
* Sinks: divide
*    GoodSink: Check for zero before dividing
*    BadSink : Dividing by a value that may be zero
* Flow Variant: 02 Control flow: if(true) and if(false)
*
* */
package com.example.kotlin.C0034_DIVBY0.m00

import testcasesupport.AbstractTestCase
import testcasesupport.IO
import kotlin.Throws

class CWE369_Divide_by_Zero__int_zero_divide_02 : AbstractTestCase() {
    @Throws(Throwable::class)
    override fun bad() {
        val data: Int
        data = if (true) {
            0
        /* POTENTIAL FLAW: data is set to zero */
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            0
        }
        if (true) {
            /* POTENTIAL FLAW: Zero denominator will cause an issue.  An integer division will
            result in an exception. */
            IO.writeLine("bad: 100/$data = ${100 / data} \n")
        }
    }

    /* goodG2B1() - use goodsource and badsink by changing first true to false */
    @Throws(Throwable::class)
    private fun goodG2B1() {
        val data: Int
        data = if (false) {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            0
        } else {
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            2
        }
        if (true) {
            /* POTENTIAL FLAW: Zero denominator will cause an issue.  An integer division will
            result in an exception. */
            IO.writeLine("bad: 100/$data = ${100 / data} \n")
        }
    }

    /* goodG2B2() - use goodsource and badsink by reversing statements in first if */
    @Throws(Throwable::class)
    private fun goodG2B2() {
        val data: Int
        data = if (true) {
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            2
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            0
        }
        if (true) {
            /* POTENTIAL FLAW: Zero denominator will cause an issue.  An integer division will
            result in an exception. */
            IO.writeLine("bad: 100/$data = ${100 / data} \n")
        }
    }

    /* goodB2G1() - use badsource and goodsink by changing second true to false */
    @Throws(Throwable::class)
    private fun goodB2G1() {
        val data: Int
        data = if (true) {
            0 /* POTENTIAL FLAW: data is set to zero */
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            0
        }
        if (false) {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string")
        } else {

            /* FIX: test for a zero denominator */
            if (data != 0) {
                IO.writeLine("bad: 100/$data = ${100 / data} \n")
            } else {
                IO.writeLine("This would result in a divide by zero")
            }
        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing statements in second if  */
    @Throws(Throwable::class)
    private fun goodB2G2() {
        val data: Int
        data = if (true) {
            0 /* POTENTIAL FLAW: data is set to zero */
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            0
        }
        if (true) {
            /* FIX: test for a zero denominator */
            if (data != 0) {
                IO.writeLine("100/$data = ${100 / data} \n")
            } else {
                IO.writeLine("This would result in a divide by zero")
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