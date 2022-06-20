package C80C9_InvalidSlf4jMessageFormat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InvalidSlf4jMessageFormat_GOOD {
    public static class Test{
        public static void main(String[] args) {
            Logger LOGGER = LogManager.getLogger(Test.class);
            LOGGER.error("param {}", "arg1", new IllegalStateException("arg"));
        }
    }
}
