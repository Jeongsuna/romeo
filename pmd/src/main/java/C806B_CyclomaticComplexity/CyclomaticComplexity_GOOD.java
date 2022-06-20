package C806B_CyclomaticComplexity;

public class CyclomaticComplexity_GOOD {
    int t = 0;
    boolean d = false;
    class Foo {
        void lowCyclo() {                // Cyclo = 6:
            int x = 0, y = 2;
            boolean a = false, b = true;

            if (a && (y == 1 ? b : true)) { // +3
                if (y == t && !d) {    // +2
                    x = a ? y : x;              // +1
                } else {
                    x = 2;
                }
            }
        }
    }
}
