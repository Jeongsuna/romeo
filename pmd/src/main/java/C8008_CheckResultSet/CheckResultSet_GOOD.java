package C8008_CheckResultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckResultSet_GOOD {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        Statement stat = con.createStatement();
        ResultSet rs = stat.executeQuery("SELECT name FROM person");
        if (rs.next()) {
            String firstName = rs.getString(1);
        } else  {
        }
    }

    public CheckResultSet_GOOD() throws SQLException {
    }
}
