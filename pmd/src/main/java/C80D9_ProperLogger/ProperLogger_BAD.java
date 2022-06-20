package C80D9_ProperLogger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ProperLogger_BAD {
    public class Foo {
        protected Log LOG = LogFactory.getLog(Testclass.class);
        private class Testclass {
        }
    }
}
