/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE315_Plaintext_Storage_in_Cookie__Servlet_01.java
Label Definition File: CWE315_Plaintext_Storage_in_Cookie__Servlet.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 315 Storing plaintext data in a cookie
* BadSource:  Set data to credentials (without hashing or encryption)
* GoodSource: Set data to a hash of credentials
* Sinks:
*    GoodSink: Hash data before storing in cookie
*    BadSink : Store data directly in cookie
* Flow Variant: 01 Baseline
*
* */

package testcases.C0015_SENDCLEAR;

import testcasesupport.*;

import javax.crypto.Cipher;
import javax.naming.InitialContext;
import javax.servlet.http.*;
import javax.sql.DataSource;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class C0015_SENDCLEAR__Socket_write_01 extends AbstractTestCaseServlet
{
	private static final String CONNECT_STRING = "jdbc:ocl:orcl";
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
    	try {
    		Socket s = new Socket("taranis", 4444);
    		PrintWriter o = new PrintWriter(s.getOutputStream(), true);
    		String password = request.getParameter("password");
    		o.write(password);
    		} catch (FileNotFoundException e) {
    			Logger.getLogger("xx").log(Level.ALL, "File not found");
    		}

    }

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
    	try {
    		Socket s = new Socket("taranis", 4444);
    		PrintStream o = new PrintStream(s.getOutputStream(), true);
    		Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
    		String password = request.getParameter("password");
    		byte[] encPassword = c.update(password.getBytes());
    		o.write(encPassword, 0, encPassword.length);
    	} catch (FileNotFoundException e) {
    		Logger.getLogger("xx").log(Level.ALL, "File not found");
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

