/*
Filename : CWE652_XQuery_Injection__Environment_executeQuery_01_bad.java
*/

package testcases.CWE652_XQuery_Injection;

import testcasesupport.*;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.*;

import net.sf.saxon.xqj.SaxonXQDataSource;
import net.sf.saxon.javax.xml.xquery.*;


import javax.servlet.http.*;

import java.util.logging.Logger;

public class CWE652_XQuery_Injection__Environment_executeQuery_01_bad extends AbstractTestCase
{

    
    public void bad() throws Throwable
    {
        String data;

        Logger log_bad = Logger.getLogger("local-logger");

        /* get environment variable ADD */
        data = System.getenv("TEST107");

		XQResultSequence     result = null;
		try
		{
			XQDataSource         ds     = new SaxonXQDataSource();
			XQConnection         xqconn   = ds.getConnection();
			XQPreparedExpression exp    = xqconn.prepareExpression(data);
			/* FLAW */
			result = exp.executeQuery();
			while(result.next()){
				System.out.println(result.getItemAsString());
			}
		}
		catch(XQException e)
		{
			IO.logger.log(Level.WARNING, "Error occurred", e);
		}
		finally
		{
			try
			{
				if(result != null)
				{
					result.close();
				}
			}catch(XQException e)
			{
				IO.logger.log(Level.WARNING, "Error closing XQResult", e);
			}
		}
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

