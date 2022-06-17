package C8080_SimplifyBooleanReturns;

public class SimplifyBooleanReturns_BAD {
    int bar = 0;
    public boolean isBarEqualTo(int x) {
        if (bar == x) {
            return true;
        } else {
            return false;
        }
    }
}
