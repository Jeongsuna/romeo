package C800C_GuardLogStatement;

import org.apache.log4j.Logger;

public class GuardLogStatement_GOOD {
    public class Test extends Throwable{
        private void bindParameters(Throwable param1) {
            Logger log = Logger.getLogger(Test.class);
            if (log.isDebugEnabled()) {
                log.debug("log something" + param1 + "concat strings");
            }
        }
    }
}
