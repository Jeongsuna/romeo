package C800C_GuardLogStatement;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class GuardLogStatement_BAD {
    public class Test extends Throwable{
        private void bindParameters(Throwable param1) {
            Logger log = Logger.getLogger(Test.class);
            log.debug("log something {}", param1);
        }
    }
}
