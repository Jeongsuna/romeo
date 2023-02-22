package C9060_AmbiguousImportDeclaration__AmbiguousImportDeclaration;

import java.util.*; // @violation
import java.sql.*; // @violation

public class C9060_AmbiguousImportDeclaration_AmbiguousImportDeclaration_bad {
    public void main(String[] args){
        try {
            ArrayList array = new ArrayList<String>();
            Collection collection = Collections.EMPTY_LIST;
            Connection conn = DriverManager.getConnection("connection url");
            System.out.println("Don't use * in import");
        }catch (SQLException e){}
    }
}
