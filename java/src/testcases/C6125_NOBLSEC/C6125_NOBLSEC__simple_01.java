package testcases.C6125_NOBLSEC;

public class C6125_NOBLSEC__simple_01 {
    public int bad(int height, int width) {
        int result = height * width;
        return result; /* Non-compliant */
    }

    public int good(int height, int width) {
        int MaxHeight = 100; /* Compliant */
        int result = height * width;

        return result; /* Compliant */
    }
}
