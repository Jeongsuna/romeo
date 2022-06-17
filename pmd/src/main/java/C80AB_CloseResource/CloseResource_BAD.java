package C80AB_CloseResource;

import java.io.*;
import java.sql.*;

public class CloseResource_BAD {
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

            }
        }

        public void withFile() throws FileNotFoundException {
            InputStream file = new FileInputStream(new File("/tmp/foo"));
            try {
                int filedata = file.read();
            } catch (IOException e) {
            } finally {
            }
        }
    }
}
