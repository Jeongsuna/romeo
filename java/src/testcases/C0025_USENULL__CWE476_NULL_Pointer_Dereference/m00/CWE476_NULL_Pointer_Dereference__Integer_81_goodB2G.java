/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE476_NULL_Pointer_Dereference__Integer_81_goodB2G.java
Label Definition File: CWE476_NULL_Pointer_Dereference.label.xml
Template File: sources-sinks-81_goodB2G.tmpl.java
*/
/*
 * @description
 * CWE: 476 Null Pointer Dereference
 * BadSource:  Set data to null
 * GoodSource: Set data to a non-null value
 * Sinks:
 *    GoodSink: add check to prevent possibility of null dereference
 *    BadSink : possibility of null dereference
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package testcases.C0025_USENULL__CWE476_NULL_Pointer_Dereference.m00;

import testcasesupport.*;

public class CWE476_NULL_Pointer_Dereference__Integer_81_goodB2G extends CWE476_NULL_Pointer_Dereference__Integer_81_base
{
    public void action(Integer data ) throws Throwable
    {

        /* FIX: validate that data is non-null */
        if (data != null)
        {
            IO.writeLine("" + data.toString());
        }
        else
        {
            IO.writeLine("data is null");
        }

    }
}
