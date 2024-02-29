package testcases.C0053_REFLECTI__CWE470;

import testcasesupport.AbstractTestCaseServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Hashtable;

public class C0053_CWE470_Unsafe_Reflection__stringlit_good_MP_1181 extends AbstractTestCaseServlet
{
    Hashtable hProd = new Hashtable();

    @Override
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        //
    }
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try
        {
            stmt = conn.prepareStatement("SELECT A FROM C");
            // taint source. 순서(1)
            rs = stmt.executeQuery();

            while (rs.next())
            {
                if (rs.getString("PROD_CD").equals("111"))
                {
                    // good: 검출되지 않아야 함 MP-1181 - taint sink. 순서(3), static method call인데 %0에 this를 넣어서 문제였음.
                    C0053_CWE470_Unsafe_Reflection__stringlit_good_MP_1181 oprod = (C0053_CWE470_Unsafe_Reflection__stringlit_good_MP_1181) Class.forName("xxxx.yyyy.zzzz.aaa.common.Product111").newInstance();

                    AbstractTestCaseServlet servlet = (AbstractTestCaseServlet) Class.forName("servlet").newInstance();

                    // this를 오염시킴. 순서(2)
                    hProd.put(rs.getString("PROD_CD"), oprod);
                }
            }

            rs.close();
            stmt.close();
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            if ( rs != null)         try { rs.close(); }         catch (Exception e) {}
            if ( stmt != null)    try { stmt.close(); }     catch (Exception e) {}
        }
    }


}

