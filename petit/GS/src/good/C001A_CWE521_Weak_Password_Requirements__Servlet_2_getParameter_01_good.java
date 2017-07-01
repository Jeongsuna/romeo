/*
Filename : CWE521_Weak_Password_Requirements__Servlet_2_getParameter_01_good.java
*/



import testcasesupport.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class C001A_CWE521_Weak_Password_Requirements__Servlet_2_getParameter_01_good extends AbstractTestCaseServlet
{

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
    	PreparedStatement sqlstatement = null;
    	Connection con = null;
    	
        try {
			String url = "jdbc:mysql://192.168.0.100:3306/test";
			String user = "root";
			String dbpw = "apmsetup";
			String passwd = request.getParameter("passwd");
			/* FIX */
			if (passwd == null || "".equals(passwd)) return;
			if (!passwd.matches("") && (passwd.indexOf("@!#")>0) && (passwd.length() > 9)) {
				con = DriverManager.getConnection(url, user, dbpw);
				
				sqlstatement = con.prepareStatement("insert into users (ID,name) values ('5',?)");
				sqlstatement.setString(1, passwd);
				
				Boolean bResult = sqlstatement.execute();
				
				if( bResult )
				{
					IO.writeString("Name, taint, has been selected");
				} 
				else
				{
					IO.writeString("Name, taint, has been inserted");
				}
			}
		} catch (SQLException e) 
		{
			System.err.println("Error has occurred");
		}
        finally
        {
        	try {
                if( sqlstatement != null )
                {
                    sqlstatement.close();
                }
            }
            catch( SQLException e )
            {
            	IO.logger.log(Level.WARNING, "Error closing sqlstatement", e);
            }
        	try
        	{
        		if(con != null)
            	{
            		con.close();
            	}	
        	}catch(SQLException e)
        	{
        		IO.logger.log(Level.WARNING, "Error closing conn", e);
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

