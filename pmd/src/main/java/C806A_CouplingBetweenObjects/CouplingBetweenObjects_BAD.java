package C806A_CouplingBetweenObjects;
import java.lang.String;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Map;

public class CouplingBetweenObjects_BAD {
    public class Foo {
        private String var1;
        private ArrayList var2 = new ArrayList();

        Object doWork() {
            int var10;
            int var56;
            int var02;
            boolean var23;
            boolean var40;
            boolean var25;
            String var55;
            String var66;
            String var13;
            Map var44;
            Map var33;
            Map var46;
            Map var86;
            ArrayList var83;
            ArrayList var93;
            ArrayList var79;
            ArrayList var88;
            Hashtable var77;
            Hashtable var11;
            Hashtable var99;
            Hashtable var49;
            return something();
        }
    }
    private Object something() {
        return null;
    }
}
