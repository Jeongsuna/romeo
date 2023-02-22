package C9083_SQLEXCPDCLCAT__SQLExceptionDeclarationInCatch;

import C9067_HARDDBCONACC__HardCodingDBConnectionAccount.DBConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class C9083_SQLEXCPDCLCAT_SQLExceptionDeclarationInCatch_bad {
    public void badMethod() throws SQLException {
        Connection conn = null;
        DBConnectionManager connMgr = DBConnectionManager.getInstance();
        Statement stmt = null;
        ResultSet rs;
        // 선언부
        try {
            conn = connMgr.getConnection("");
            String sql = "SELECT name, age, address FROM TEST";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            // do something.
        } catch (SQLException sqle) { // @violation
            conn.rollback();
            // 로그 기록 및 관련 사항 처리
        } finally {
            // 자원 해제 관련 코드 생략(rs, stmt and conn, etc)
        }
    }
}
