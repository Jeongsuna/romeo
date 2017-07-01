/*
 * @description uncontrolled recursion due to missing base or exit case
 *
 * */



import java.security.SecureRandom;

import testcasesupport.AbstractTestCase;
import testcasesupport.IO;

public class C0021_CWE674_Uncontrolled_Recursion__missing_base_01_good extends AbstractTestCase 
{
    private static long helperGood(long level)
    {
        /* FIX */
		if(level == 0)
			return 0;
		else
		{
			long longSum = level + helperBad(level-1);
			return longSum;
		}
		
		
    }
    
    public void good()
    {
        long longSecureRandom = (new SecureRandom()).nextInt(100);
            
        IO.writeLine(helperBad(longSecureRandom));
    }
    
   
    /* Below is the main(). It is only used when building this testcase on 
     * its own for testing or for building a binary to use in testing binary 
     * analysis tools. It is not used when compiling all the testcases as one 
     * application, which is how source code analysis tools are tested. 
	 */ 
    public static void main(String[] args) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        mainFromParent(args);
    }
}
