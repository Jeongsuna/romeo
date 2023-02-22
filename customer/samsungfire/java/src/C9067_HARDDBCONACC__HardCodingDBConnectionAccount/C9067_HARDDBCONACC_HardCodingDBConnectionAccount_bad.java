package C9067_HARDDBCONACC__HardCodingDBConnectionAccount;

import java.sql.Connection;

public class C9067_HARDDBCONACC_HardCodingDBConnectionAccount_bad {

    public void badMethod() {
        try {
            DBConnectionManager connMgr = DBConnectionManager.getInstance();
            Connection conn = connMgr.getConnection("db2"); // @violation
        } catch (Exception e) {
           System.out.print("DB 연결에 실패하였습니다.");
        }
    }
}
