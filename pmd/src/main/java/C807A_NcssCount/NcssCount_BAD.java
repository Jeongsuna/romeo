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
                    int x2 = 0, y2 = 2;               // +1
                    boolean a2 = false, b2 = true;    // +1

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
                    int x3 = 0, y3 = 2;               // +1
                    boolean a3 = false, b3 = true;    // +1

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
                    int x4 = 0, y4 = 2;               // +1
                    boolean a4 = false, b4 = true;    // +1

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
                    int x5 = 0, y5 = 2;               // +1
                    boolean a5 = false, b5 = true;    // +1

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
                    int x6 = 0, y6 = 2;               // +1
                    boolean a6 = false, b6 = true;    // +1

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
