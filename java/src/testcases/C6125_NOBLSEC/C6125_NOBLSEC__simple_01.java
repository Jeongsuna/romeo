package testcases.C6125_NOBLSEC;

public class C6125_NOBLSEC__simple_01 {
    public int bad(int h, int w) { return h*w; } /* Non-compliant */

    public int good(int h, int w) {
        return h*w; /* Compliant */
    }
}
