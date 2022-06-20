package C80D9_ProperLogger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ProperLogger_GOOD {
    public static class Foo {
        private static final Log LOG = LogFactory.getLog(Foo.class);
    }
}
