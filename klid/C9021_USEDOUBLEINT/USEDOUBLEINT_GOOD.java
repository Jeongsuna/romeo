package C9021_USEDOUBLEINT;

public class USEDOUBLEINT_GOOD{
    public static void main(String[] args) {
        Long l = new Long(15552451L);
        double d = Double.longBitsToDouble(l);  // Compliant
    }
}
