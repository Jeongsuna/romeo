package C9067_HARDDBCONACC__HardCodingDBConnectionAccount;

import java.sql.Connection;

public class C9067_HARDDBCONACC_HardCodingDBConnectionAccount_good {

    public void goodMethod() {
        try {
            DBConnectionManager connMgr = DBConnectionManager.getInstance();
            String dbInfo = getMethod(); // @fixed
            Connection conn = connMgr.getConnection(dbInfo);
        } catch (Exception e) {
           System.out.print("DB 연결에 실패하였습니다.");
        }
    }

    public String getMethod(){
        return "dbinfo";
    }
}
