package C9077_REUSEJDBCRSC__ReusingJDBCStatementResource;

import C9067_HARDDBCONACC__HardCodingDBConnectionAccount.DBConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class C9077_REUSEJDBCRSC_ReusingJDBCStatementResource_bad {
    public void badMethod() throws SQLException {
        Connection conn = null;
        DBConnectionManager connMgr = DBConnectionManager.getInstance();
        PreparedStatement pstmt = null;
        try {
            conn = connMgr.getConnection("");
            String sql = "SELECT name, age, address FROM . . . ";
            pstmt = conn.prepareStatement(sql);
            pstmt = conn.prepareStatement(sql); // @violation
        } catch (SQLException sqle) {
            conn.rollback();
        } finally {
            // 자원 해제 관련 코드 생략(rs, pstmt, conn)
        }
    }
}
