package C806A_CouplingBetweenObjects;

import java.util.ArrayList;
import java.util.Map;

public class CouplingBetweenObjects_GOOD {
    public class Foo {
        private String var1;
        private ArrayList var2 = new ArrayList();

        Object doWork() {
            String var55;
            Map var44;
            ArrayList var93;
            return something();
        }
    }
    private Object something() {
        return null;
    }
}
