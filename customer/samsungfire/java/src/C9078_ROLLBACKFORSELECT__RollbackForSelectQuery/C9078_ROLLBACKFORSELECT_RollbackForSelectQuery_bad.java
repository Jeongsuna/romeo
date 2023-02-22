package C9078_ROLLBACKFORSELECT__RollbackForSelectQuery;

import C9067_HARDDBCONACC__HardCodingDBConnectionAccount.DBConnectionManager;

import java.sql.*;

public class C9078_ROLLBACKFORSELECT_RollbackForSelectQuery_bad {
    public void badMethod() throws SQLException {
        Connection conn = null;
        DBConnectionManager connMgr = DBConnectionManager.getInstance();
        Statement stmt = null;
        ResultSet rs;
        try {
            conn = connMgr.getConnection("");
            String sql = "SELECT name, age, address FROM TEST";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

        } catch (SQLException sqle) {
            conn.rollback(); // 불필요한 로직 // @violation
        } finally {
            // 리소스 해제
        }
    }
}
