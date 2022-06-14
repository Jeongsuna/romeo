package C8020_SystemPrintln;

import java.util.logging.Logger;

public class SystemPrintln_GOOD {
    class Test{
        Logger log = Logger.getLogger(Test.class.getName());
        public void foo () {
            log.fine("Print");
        }
    }
}
