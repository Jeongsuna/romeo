package C80AB_CloseResource;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseResource_GOOD {
    public class Bar {
        public void withSQL() throws SQLException {
            DriverManager DataSourceUtils = null;
            String dataSource="";
            Connection c = DataSourceUtils.getConnection(dataSource);
            Statement request = null;
            try {
                request = c.createStatement();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                c.close();
            }
        }

        public void withFile() throws IOException {
            InputStream file = new FileInputStream(new File("/tmp/foo"));
            try {
                int filedata = file.read();
            } catch (IOException e) {
            } finally {
                file.close();
            }
        }
    }
}
