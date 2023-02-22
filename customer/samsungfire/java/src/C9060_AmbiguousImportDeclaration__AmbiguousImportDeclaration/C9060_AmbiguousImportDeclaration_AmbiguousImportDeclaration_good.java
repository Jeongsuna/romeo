package C9060_AmbiguousImportDeclaration__AmbiguousImportDeclaration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class C9060_AmbiguousImportDeclaration_AmbiguousImportDeclaration_good {
    public void main(String[] args){
        try {
            ArrayList array = new ArrayList<String>();
            Collection collection = Collections.EMPTY_LIST;
            Connection conn = DriverManager.getConnection("connection url");
            System.out.println("Don't use * in import");
        }catch (SQLException e){}
    }
}
