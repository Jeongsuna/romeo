package C9006_WRAPCLASSINSTANT;

public class WRAPCLASSINSTANT_BAD {
    public static void main(String[] args) {
        int myInteger = 0;
        new Integer(myInteger).toString();      // Noncompliant
    }
}
