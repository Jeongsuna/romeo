import java.sql.Connection;
import java.sql.PreparedStatement;

public class C006B_SQLMATCH_bad 
{
    public void good(Connection con) throws Throwable
    {
    	String where = "and address = ?";
    	PreparedStatement p = con.prepareStatement("select * from people where (first_name = ? or last_name = ?) " + where);
    			p.setString(1, "a");
    			p.setString(2, "b");
    			p.setString(3, "c");
    }
    public void bad1(Connection con) throws Throwable
    {
    	String where = "and address = ?";
    	PreparedStatement p = con.prepareStatement("select * from people where (first_name = ? or last_name = ?) " + where);
    			p.setString(1, "a");
    			p.setString(2, "b");
    			p.setString(3, "c");
    			p.setLong(4, 0);
    }
    public void bad2(Connection con) throws Throwable
    {
    	String where = "and address = ?";
    	PreparedStatement p = con.prepareStatement("select * from people where (first_name = ? or last_name = ?) " + where);
    			p.setString(1, "a");
    			p.setString(2, "b");
    }
    public void bad3(Connection con) throws Throwable
    {
    	String where = "and address = ?";
    	PreparedStatement p = con.prepareStatement("select * from people where (first_name = ? or last_name = ?) " + where);
    			p.setString(1, "a");
    			p.setLong(2, 0);
    }
    
    public void bad4DIFFICULT(Connection con) throws Throwable
    {
    	String where = "and address = ?";
    	PreparedStatement p = con.prepareStatement("select * from people where (first_name = ? or last_name = ?) " + where);
		p.setString(1, "a");
		p.setString(1, "b");
		p.setString(1, "c");
    }
}