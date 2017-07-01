/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE476_NULL_Pointer_Dereference__Integer_01.java
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



import testcasesupport.*;

public class C0025_CWE476_NULL_Pointer_Dereference_bad extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        String cmd = null;
		if(System.getProperty("cmd") != null)
			cmd = System.getProperty("cmd");
		// cmd가 null인지 체크하지 않아 널 포인터 예외가 발생할 수 있다.
		cmd = cmd.trim();
		System.out.println(cmd);
    }

    /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

