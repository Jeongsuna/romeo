package testcases.C00AD_SENSLOG__CWE532;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class bad2 {
    public BankAccount getUserBankAccount(String username, String accountNumber) {
        BankAccount userAccount = null;
        try {
            if (isAuthorizedUser(username)) {
                String query = "SELECT * FROM accounts WHERE owner = ? AND accountID = ?";
                DatabaseManager dbManager = new DatabaseManager();
                Connection conn = dbManager.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setString(1, username);
                pstmt.setString(2, accountNumber);
                ResultSet queryResult = pstmt.executeQuery();
                if (queryResult.next()) {
                    userAccount = (BankAccount) queryResult.getObject(accountNumber);
                }
            }
        } catch (SQLException ex) {
            String logMessage = "Unable to retrieve account information from database,\nquery: " + query;
            Logger.getLogger(BankManager.class.getName()).log(Level.SEVERE, logMessage, ex);
        }
        return userAccount;
    }

    private boolean isAuthorizedUser(String username) {
        // 이 메소드는 사용자가 인증된 사용자인지 확인하는 로직을 구현해야 합니다.
        // 여기서는 단순히 true를 반환하도록 하겠습니다.
        return true;
    }
}
