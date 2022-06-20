package C807B_NPathComplexity;

import java.util.ArrayList;
import java.util.List;

public class NPathComplexity_GOOD {
    public static class Foo {
        static int j = 10;
        public static void bar() { // Ncss = 12: Unreported!
            boolean a = false, b = true;
            try { // 2 * 2 + 2 = 6
                if (true) { // 2
                    List buz = new ArrayList();
                }

                for(int i = 0; i < 19; i++) { // * 2
                    List buz = new ArrayList();
                }
            } catch(Exception e) {
                if (true) { // 2
                    e.printStackTrace();
                }
            }
            while (j++ < 20) { //  * 2
                List buz = new ArrayList();
            }
        }
    }
}
