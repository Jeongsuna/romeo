package C80D3_MoreThanOneLogger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoreThanOneLogger_BAD {
    public class Foo {
        Logger log = LogManager.getLogger(Foo.class.getName());
        Logger log2= LogManager.getLogger(Foo.class.getName());
    }
}
