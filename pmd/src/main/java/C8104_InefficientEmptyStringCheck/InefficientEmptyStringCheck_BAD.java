package C8104_InefficientEmptyStringCheck;

public class InefficientEmptyStringCheck_BAD {
    public class Test {
        void foo(String x) {
            if (x != null && x.trim().length() > 0) {
                testMethod();
            }
        }
        private void testMethod() {
        }
    }
}
