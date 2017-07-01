
import testcasesupport.*;

import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import java.util.logging.Logger;


import javax.servlet.http.*;
import java.io.*;

public class C002E_CWE247_Reliance_on_DNS_Lookups_in_a_Security_Decision__01_bad extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
	    boolean trusted = false;
	    String ip = request.getRemoteAddr();
	    // 호스트의 IP 주소를 얻어온다.
	    InetAddress addr = InetAddress.getByName(ip);
	    // 호스트의 DNS이름이 신뢰할 수 있는 도메인(trustme.com)에 속하는지 검사한다.
	    if (addr.getCanonicalHostName().endsWith("trustme.com")) {
	      trusted = true;
	    }
	    // 공격자는 DNS 캐쉬 등을 조작해서 이러한 보안설정을 우회할 수 있다.
	    if (trusted) {
	     
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

