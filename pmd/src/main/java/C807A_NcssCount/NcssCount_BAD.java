package C807A_NcssCount;
import java.util.Collections;       // +0
import java.io.IOException;         // +0

public class NcssCount_BAD {

    class Foo {                         // +1, total Ncss > 60
        public void bigMethod()           // +1
                throws Exception {
            int x = 0, y = 2;               // +1
            boolean a = false, b = true;    // +1

            if (a || b) {                   // +1
                try {                         // +1
                    do {                        // +1
                        x += 2;                   // +1
                    } while (x < 12);

                    System.exit(0);             // +1
                } catch (Exception e) {   // +1
                    e.printStackTrace(); // +1
                }
            } else {
                assert false;                 // +1
            }
        }
        public void bigMethod2()           // +1
                throws Exception {
            int x = 0, y = 2;               // +1
            boolean a = false, b = true;    // +1

            if (a || b) {                   // +1
                try {                         // +1
                    do {                        // +1
                        x += 2;                   // +1
                    } while (x < 12);

                    System.exit(0);             // +1
                } catch (Exception e) {   // +1
                    e.printStackTrace(); // +1
                }
            } else {
                assert false;                 // +1
            }
        }
        public void bigMethod3()           // +1
                throws Exception {
            int x = 0, y = 2;               // +1
            boolean a = false, b = true;    // +1

            if (a || b) {                   // +1
                try {                         // +1
                    do {                        // +1
                        x += 2;                   // +1
                    } while (x < 12);

                    System.exit(0);             // +1
                } catch (Exception e) {   // +1
                    e.printStackTrace(); // +1
                }
            } else {
                assert false;                 // +1
            }
        }
        public void bigMethod4()           // +1
                throws Exception {
            int x = 0, y = 2;               // +1
            boolean a = false, b = true;    // +1

            if (a || b) {                   // +1
                try {                         // +1
                    do {                        // +1
                        x += 2;                   // +1
                    } while (x < 12);

                    System.exit(0);             // +1
                } catch (Exception e) {   // +1
                    e.printStackTrace(); // +1
                }
            } else {
                assert false;                 // +1
            }
        }
        public void bigMethod5()           // +1
                throws Exception {
            int x = 0, y = 2;               // +1
            boolean a = false, b = true;    // +1

            if (a || b) {                   // +1
                try {                         // +1
                    do {                        // +1
                        x += 2;                   // +1
                    } while (x < 12);

                    System.exit(0);             // +1
                } catch (Exception e) {   // +1
                    e.printStackTrace(); // +1
                }
            } else {
                assert false;                 // +1
            }
        }
    }
}
