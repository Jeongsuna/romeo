package C9021_USEDOUBLEINT;

public class USEDOUBLEINT_BAD {
    public static void main(String[] args) {
        int i = 42;
        double d = Double.longBitsToDouble(i);  // Noncompliant
    }
}
