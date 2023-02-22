package C9078_ROLLBACKFORSELECT__RollbackForSelectQuery;

import C9067_HARDDBCONACC__HardCodingDBConnectionAccount.DBConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class C9078_ROLLBACKFORSELECT_RollbackForSelectQuery_good {
    public void goodMethod() throws SQLException {
        Connection conn = null;
        DBConnectionManager connMgr = DBConnectionManager.getInstance();
        Statement stmt = null;
        ResultSet rs;
        try {
            conn = connMgr.getConnection("");
            String sql = "SELECT name, age, address from test";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException sqle) {
            // @fixed
            // 로그 기록
        } finally {
            // 리소스 해제
        }
    }
}
