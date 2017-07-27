import java.sql.Connection;
import java.sql.PreparedStatement;

public class C006A_SQLASTER
{
    public void bad(Connection con) throws Throwable
    {
		String select = "SEleCT * ";
		
    	String where = "and address = ?";
    	PreparedStatement p = con.prepareStatement(select + "from people where (first_name = ? or last_name = ?) " + where);
    			p.setString(1, "a");
    			p.setString(2, "b");
    			p.setString(3, "c");
    }
	
    public void good(Connection con) throws Throwable
    {
    	String where = "and address = ?";
    	PreparedStatement p = con.prepareStatement("select first_name from people where (first_name = ? or last_name = ?) " + where);
    			p.setString(1, "a");
    			p.setString(2, "b");
    			p.setString(3, "c");
    }
	
    public void bad2(Connection con) throws Throwable
    {
    	String where = "and address = ?";
    	PreparedStatement p = con.prepareStatement("SELECT * from people where (first_name = ? or last_name = ?) " + where);
    			p.setString(1, "a");
    			p.setString(2, "b");
    			p.setString(3, "c");
    }
    public void bad3(Connection con) throws Throwable
    {
    	String where = "and (last_name LIKE '%')";
    	PreparedStatement p = con.prepareStatement("SELECT first_name from people where (first_name = ? or last_name = ?) " + where);
    			p.setString(1, "a");
    			p.setString(2, "b");
    }
    public void bad4(Connection con) throws Throwable
    {
    	String where = "and (last_name LiKE \"%\")";
    	PreparedStatement p = con.prepareStatement("SELECT last_name from people where (first_name = ? or last_name = ?) " + where);
    			p.setString(1, "a");
    			p.setString(2, "b");
    }
}
