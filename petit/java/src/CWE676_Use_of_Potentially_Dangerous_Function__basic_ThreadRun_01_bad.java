/*
Filename : CWE676_Use_of_Potentially_Dangerous_Function__basic_ThreadRun_01_bad.java
*/

package testcases.CWE676_Use_of_Potentially_Dangerous_Function;

import testcasesupport.*;

public class CWE676_Use_of_Potentially_Dangerous_Function__basic_ThreadRun_01_bad extends AbstractTestCase
{

    public void bad() throws Throwable
    {
    	/* FLAW */
    	new ThreadRun("DummyThread").run();
    }


    
    

    /* Below is the main(). It is only used when building this testcase on
       its own for testing or for building a binary to use in testing binary
       analysis tools. It is not used when compiling all the testcases as one
       application, which is how source code analysis tools are tested. */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

class ThreadRun extends Thread
{
	public ThreadRun(String str)
	{
		super(str);
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			try
			{
				IO.writeLine(i + " - Name: "+ getName());
				sleep(1000);
			}
			catch(InterruptedException e)
			{
				IO.writeLine("Exception Occurred");
			}
		}
	}
}

