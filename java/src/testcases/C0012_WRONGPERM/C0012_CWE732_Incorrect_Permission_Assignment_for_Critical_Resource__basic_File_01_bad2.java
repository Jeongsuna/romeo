package testcases.C0012_WRONGPERM;

/*
Filename : CWE732_Incorrect_Permission_Assignment_for_Critical_Resource__basic_File_01_bad.java
*/



import testcasesupport.*;

import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.servlet.http.*;
import java.io.*;

public class C0012_CWE732_Incorrect_Permission_Assignment_for_Critical_Resource__basic_File_01_bad2 extends AbstractTestCase
{

 

    public void bad() throws Throwable
    {
    	File file = new File("/home/setup/system.ini");
    	// FLAW
		file.setExecutable(true, false);
		file.setReadable(true, false);
		file.setWritable(true, false);
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



	@Override
	public void good() throws Throwable {
		File file = new File("/home/setup/system.ini");
		file.setExecutable(false);
		file.setReadable(true);
		file.setWritable(false);
	}
}

