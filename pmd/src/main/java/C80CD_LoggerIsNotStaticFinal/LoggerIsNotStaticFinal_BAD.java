package C80CD_LoggerIsNotStaticFinal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerIsNotStaticFinal_BAD {
    public class Foo{
        Logger log = LogManager.getLogger(Foo.class.getName());
    }
}
