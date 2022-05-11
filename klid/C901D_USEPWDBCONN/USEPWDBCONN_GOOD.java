package C901D_USEPWDBCONN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class USEPWDBCONN_GOOD {
    String password = System.getProperty("database.password");
    Connection conn = DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", password);

    public USEPWDBCONN_GOOD() throws SQLException {
    }
}
