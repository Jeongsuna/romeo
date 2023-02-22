package C9085_STTVARFORCON__StaticVariablesForConnection;

import common.ConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;

public class C9085_SQLASTER_StaticVariablesForConnection_bad {
    public static Connection conn = null; // @violation
    public static ConnectionPool pool;

    public C9085_SQLASTER_StaticVariablesForConnection_bad() throws SQLException {
        conn = pool.getConnection();
    }
    public void someMethod() throws SQLException {
        C9085_SQLASTER_StaticVariablesForConnection_bad someClass = new C9085_SQLASTER_StaticVariablesForConnection_bad();
        C9085_SQLASTER_StaticVariablesForConnection_bad someClass2 = new C9085_SQLASTER_StaticVariablesForConnection_bad();
        // 이전 Connection에 대한 리소스 누수가 발생한다.
    }
}
