package C903D_RETURNMAXMIN;

public class RETURNMAXMIN_Good2 {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {    // Let's say num = 12
        int result = Math.min(UPPER, num);  // result = 12
        return Math.max(LOWER, result);     // Compliant; result is still 12
    }
}
