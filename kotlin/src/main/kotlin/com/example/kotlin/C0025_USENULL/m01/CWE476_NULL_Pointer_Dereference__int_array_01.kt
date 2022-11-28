/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE476_NULL_Pointer_Dereference__int_array_01.java
Label Definition File: CWE476_NULL_Pointer_Dereference.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 476 Null Pointer Dereference
* BadSource:  Set data to null
* GoodSource: Set data to a non-null value
* Sinks:
*    GoodSink: add check to prevent possibility of null dereference
*    BadSink : possibility of null dereference
* Flow Variant: 01 Baseline
*
* */
package romeo

import kotlin.Throws

class CWE476_NULL_Pointer_Dereference__int_array_01 : AbstractTestCase() {
    @Throws(Throwable::class)
    fun bad() {
        lateinit val data: IntArray

        /* POTENTIAL FLAW: data is null */
        data = null

        /* POTENTIAL FLAW: null dereference will occur if data is null */
        IO.writeLine("" + data!!.size)
    }

    @Throws(Throwable::class)
    fun good() {
        goodG2B()
        goodB2G()
    }

    /* goodG2B() - use goodsource and badsink */
    @Throws(Throwable::class)
    private fun goodG2B() {
        lateinit val data: IntArray

        /* FIX: hardcode data to non-null */
        data = IntArray(5)

        /* POTENTIAL FLAW: null dereference will occur if data is null */
        IO.writeLine("" + data.size)
    }

    /* goodB2G() - use badsource and goodsink */
    @Throws(Throwable::class)
    private fun goodB2G() {
        lateinit val data: IntArray

        /* POTENTIAL FLAW: data is null */
        data = null

        /* FIX: validate that data is non-null */
        if (data != null) {
            IO.writeLine("" + data.size)
        } else {
            IO.writeLine("data is null")
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