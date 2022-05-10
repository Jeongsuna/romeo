package C9007_EXCEPTIONPRESERVE;

public class EXCEPTIONPRESERVE_GOOD {
    public static void main(String[] args) {
        try {
            /* ... */
        } catch (RuntimeException e) {
            TestMethod();
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void TestMethod() {
    }
}
