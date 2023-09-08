package testcases.C0010_MISSAUTH__CWE306;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class C0010_MISSAUTH__simple_02 {

    public static void bad(String[] args) {
        String url = System.getenv("DB_URL");
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("데이터베이스에 성공적으로 연결되었습니다.");
            connection.close();
        } catch (SQLException e) {
            System.out.println("데이터베이스 연결에 실패했습니다. 오류 메시지: " + e.getMessage());
        }
        
    }

    public static void good1(String[] args) {
        String url = System.getenv("DB_URL");
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");

        if (username != null && !username.trim().isEmpty() && password != null && !password.trim().isEmpty()) {
            try {
                Connection connection = DriverManager.getConnection(url, username, password);
                System.out.println("데이터베이스에 성공적으로 연결되었습니다.");
                connection.close();
            } catch (SQLException e) {
                System.out.println("데이터베이스 연결에 실패했습니다. 오류 메시지: " + e.getMessage());
            }
        } else {
            System.out.println("사용자 이름과 비밀번호를 확인해주세요.");
        }
    }
}