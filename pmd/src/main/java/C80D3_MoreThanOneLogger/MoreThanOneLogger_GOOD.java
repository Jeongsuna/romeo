package C80D3_MoreThanOneLogger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoreThanOneLogger_GOOD {
    public class Foo {
        Logger log = LogManager.getLogger(Foo.class.getName());
    }
}
