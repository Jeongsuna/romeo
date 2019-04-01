/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE369_Divide_by_Zero__int_zero_divide_54d.java
Label Definition File: CWE369_Divide_by_Zero__int.label.xml
Template File: sources-sinks-54d.tmpl.java
*/
/*
 * @description
 * CWE: 369 Divide by zero
 * BadSource: zero Set data to a hardcoded value of zero
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: divide
 *    GoodSink: Check for zero before dividing
 *    BadSink : Dividing by a value that may be zero
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */

package testcases.C0034_DIVBY0_CWE369_Divide_by_Zero.m00;

public class CWE369_Divide_by_Zero__int_zero_divide_54d
{
    public void badSink(int data ) throws Throwable
    {
        (new CWE369_Divide_by_Zero__int_zero_divide_54e()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(int data ) throws Throwable
    {
        (new CWE369_Divide_by_Zero__int_zero_divide_54e()).goodG2BSink(data );
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(int data ) throws Throwable
    {
        (new CWE369_Divide_by_Zero__int_zero_divide_54e()).goodB2GSink(data );
    }
}
