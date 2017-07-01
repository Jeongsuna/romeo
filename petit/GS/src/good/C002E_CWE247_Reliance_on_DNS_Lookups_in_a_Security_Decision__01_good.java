
import testcasesupport.*;

import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import java.util.logging.Logger;


import javax.servlet.http.*;
import java.io.*;

public class C002E_CWE247_Reliance_on_DNS_Lookups_in_a_Security_Decision__01_good extends AbstractTestCaseServlet
{
	public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
		String ip = request.getRemoteAddr();

	    if (ip==null || "".equals(ip))
	      return;
	    // DNS lookup에 의한 호스트 이름이 아닌 IP주소를 직접 비교해야 한다.
	    String trustedAddr = "127.0.0.1";
	    if (ip.equals(trustedAddr)) {
	      
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

