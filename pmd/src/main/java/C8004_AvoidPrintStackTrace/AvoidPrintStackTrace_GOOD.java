package C8004_AvoidPrintStackTrace;

import java.util.logging.Logger;

public class AvoidPrintStackTrace_GOOD {
    class Test {
        Logger log = Logger.getLogger(Test.class.getName());
        void foo() {
            try {
            } catch (Exception e) {
                log.fine("Print");
            }
        }
    }
}
