package C9084_SQLINSFIXCOL__SQLInsertNotFixColumn;

import C9067_HARDDBCONACC__HardCodingDBConnectionAccount.DBConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class C9084_SQLINSFIXCOL_SQLInsertNotFixColumn_good {
    public void badMethod() throws SQLException {
        Connection conn = null;
        DBConnectionManager connMgr = DBConnectionManager.getInstance();
        Statement stmt = null;
        ResultSet rs;
        // 선언부
        try {
            conn = connMgr.getConnection("");
            String sql = "INSERT INTO someTable (colum1, colum2 ... ) VALUES (var1 ,var2 ... ) "; // @fixed
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
