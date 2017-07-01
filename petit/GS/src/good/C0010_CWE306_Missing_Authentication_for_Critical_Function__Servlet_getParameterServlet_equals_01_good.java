/*
Filename : CWE306_Missing_Authentication_for_Critical_Function__Servlet_getParameterServlet_equals_01_good.java
*/



import testcasesupport.*;

import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import java.util.logging.Logger;


import javax.servlet.http.*;
import java.io.*;

public class C0010_CWE306_Missing_Authentication_for_Critical_Function__Servlet_getParameterServlet_equals_01_good extends AbstractTestCaseServlet
{
	class BankAccount
	{
		int accountNumber;
		String toPerson;
		int balance;

		public void setAccountNumber(int accountNumber)
		{
			this.accountNumber= accountNumber;
		}
		public void setToPerson(String toPerson)
		{
			this.toPerson = toPerson;
		}
		public void setBalance(int balance)
		{
			this.balance = balance;
		}
		public int send()
		{
			return 0;
		}		
	}

 

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String newUserName;
        String newPassword;
        String password;
        String userName;
		String toPerson;
	    int balance, accountNumber;

        newUserName = request.getParameter("username");
        newPassword = request.getParameter("password");
        toPerson ="person";
	    	balance = 1;
	    	accountNumber = 11;
		
        if(newUserName == null || newPassword == null)
        {
            response.getWriter().println("first data error");
        }
        
	    HttpSession session = request.getSession(true);
		
        password = session.getAttribute("password").toString();
	    userName = session.getAttribute("username").toString();
        
        if(password == null || userName == null)
        {
            response.getWriter().println("second data error");
        }
        
        /* FIX */
        if (userName.equals(newUserName) && password.equals(newPassword)) {
        	BankAccount account = new BankAccount();
        	account.setAccountNumber(accountNumber);
        	account.setToPerson(toPerson);
        	account.setBalance(balance);
        	account.send();
        }
    }
	
}

