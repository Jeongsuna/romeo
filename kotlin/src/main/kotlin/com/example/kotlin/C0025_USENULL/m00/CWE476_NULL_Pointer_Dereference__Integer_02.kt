/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE476_NULL_Pointer_Dereference__Integer_02.java
Label Definition File: CWE476_NULL_Pointer_Dereference.label.xml
Template File: sources-sinks-02.tmpl.java
*/
/*
* @description
* CWE: 476 Null Pointer Dereference
* BadSource:  Set data to null
* GoodSource: Set data to a non-null value
* Sinks:
*    GoodSink: add check to prevent possibility of null dereference
*    BadSink : possibility of null dereference
* Flow Variant: 02 Control flow: if(true) and if(false)
*
* */
package com.example.kotlin.C0025_USENULL.m00

import testcasesupport.AbstractTestCase
import testcasesupport.IO
import kotlin.Throws

class CWE476_NULL_Pointer_Dereference__Integer_02 : AbstractTestCase() {
    @Throws(Throwable::class)
    override fun bad() {
        val data: Integer?
        data = if (true) {
            /* POTENTIAL FLAW: data is null */
            null
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            null
        }
        if (true) {
            /* POTENTIAL FLAW: null dereference will occur if data is null */
            IO.writeLine("" + data.toString())
        }
    }

    /* goodG2B1() - use goodsource and badsink by changing first true to false */
    @Throws(Throwable::class)
    private fun goodG2B1() {
        val data: Int?
        data = if (false) {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            null
        } else {

            /* FIX: hardcode data to non-null */
            Integer.valueOf(5)
        }
        if (true) {
            /* POTENTIAL FLAW: null dereference will occur if data is null */
            IO.writeLine("" + data.toString())
        }
    }

    /* goodG2B2() - use goodsource and badsink by reversing statements in first if */
    @Throws(Throwable::class)
    private fun goodG2B2() {
        val data: Int?
        data = if (true) {
            /* FIX: hardcode data to non-null */
            Integer.valueOf(5)
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            null
        }
        if (true) {
            /* POTENTIAL FLAW: null dereference will occur if data is null */
            IO.writeLine("" + data.toString())
        }
    }

    /* goodB2G1() - use badsource and goodsink by changing second true to false */
    @Throws(Throwable::class)
    private fun goodB2G1() {
        val data: Int?
        data = if (true) {
            /* POTENTIAL FLAW: data is null */
            null
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            null
        }
        if (false) {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string")
        } else {

            /* FIX: validate that data is non-null */
            if (data != null) {
                IO.writeLine("" + data.toString())
            } else {
                IO.writeLine("data is null")
            }
        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing statements in second if  */
    @Throws(Throwable::class)
    private fun goodB2G2() {
        val data: Int?
        data = if (true) {
            /* POTENTIAL FLAW: data is null */
            null
        } else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
             * but ensure data is inititialized before the Sink to avoid compiler errors */
            null
        }
        if (true) {
            /* FIX: validate that data is non-null */
            if (data != null) {
                IO.writeLine("" + data.toString())
            } else {
                IO.writeLine("data is null")
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