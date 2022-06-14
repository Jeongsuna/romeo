package C8004_AvoidPrintStackTrace;

public class AvoidPrintStackTrace_BAD {
    class Test {
        void foo() {
            try {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
