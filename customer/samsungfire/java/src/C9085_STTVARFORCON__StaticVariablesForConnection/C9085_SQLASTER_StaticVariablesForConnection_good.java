package C9085_STTVARFORCON__StaticVariablesForConnection;

import common.ConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;

public class C9085_SQLASTER_StaticVariablesForConnection_good {
    private Connection conn = null; // @fixed
    public static ConnectionPool pool;

    public C9085_SQLASTER_StaticVariablesForConnection_good() throws SQLException {
        conn = pool.getConnection();
    }
    public void someMethod() throws SQLException {
        C9085_SQLASTER_StaticVariablesForConnection_good someClass = new C9085_SQLASTER_StaticVariablesForConnection_good();
        C9085_SQLASTER_StaticVariablesForConnection_good someClass2 = new C9085_SQLASTER_StaticVariablesForConnection_good();
        // 이전 Connection에 대한 리소스 누수가 발생한다.
    }
}
