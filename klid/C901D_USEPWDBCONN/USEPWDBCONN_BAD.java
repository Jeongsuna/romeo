package C901D_USEPWDBCONN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class USEPWDBCONN_BAD {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", "");
    }
}

