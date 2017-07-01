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

public class C0025_CWE476_NULL_Pointer_Dereference_good extends AbstractTestCase
{
    public void good() throws Throwable
    {
        String cmd = System.getProperty("cmd");
		// cmd가 null인지 체크해야 한다.
		if (cmd !=null) {
		  cmd = cmd.trim();
		  System.out.println(cmd);
		} else {
		  System.out.println("Null Command");
		}
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

