package C800C_GuardLogStatement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GuardLogStatement_BAD {
    public class Test extends Throwable{
        private void bindParameters(Throwable param1) {
            Logger log = LogManager.getLogger(Test.class);
            log.debug("log something {}", param1);
        }
    }
}
