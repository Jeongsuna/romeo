package C9007_EXCEPTIONPRESERVE;

public class EXCEPTIONPRESERVE_BAD {
    public static void main(String[] args) {
        try {
            /* ... */
        } catch (Exception e) {
            throw new RuntimeException("context");
        }
    }
}
