package C80CD_LoggerIsNotStaticFinal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerIsNotStaticFinal_GOOD {
    public static class Foo{
        static final Logger log = LogManager.getLogger(Foo.class.getName());
    }
}
