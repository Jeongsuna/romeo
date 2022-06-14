package C8104_InefficientEmptyStringCheck;

public class InefficientEmptyStringCheck_GOOD {
    public class Test {
        void foo(String x) {
            if (x != null && checkTrimEmpty(x)) {
                testMethod();
            }
        }
        private void testMethod() {
        }
    }
    private boolean checkTrimEmpty(String bar) {
        for(int i = 0; i < bar.length(); i++) {
            if(!Character.isWhitespace(bar.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
