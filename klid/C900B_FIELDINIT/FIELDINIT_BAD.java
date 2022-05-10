package C900B_FIELDINIT;

import java.util.List;

public class FIELDINIT_BAD {
    public void testMethod(String Var, int x, List<String> strList) {
        Var = Integer.toString(x);
    }
}
