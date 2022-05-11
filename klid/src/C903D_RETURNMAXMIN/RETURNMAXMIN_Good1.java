package C903D_RETURNMAXMIN;

public class RETURNMAXMIN_Good1 {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {    // Let's say num = 12
        int result = Math.max(LOWER, num);  // result = 12
        return Math.min(UPPER, result);     // Compliant; result is still 12
    }
}
