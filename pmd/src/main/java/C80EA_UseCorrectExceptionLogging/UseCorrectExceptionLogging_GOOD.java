package C80EA_UseCorrectExceptionLogging;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UseCorrectExceptionLogging_GOOD {
    public static class Main {
        private static final Log _LOG = LogFactory.getLog( Main.class );
        void bar() {
            try {
            }catch( Exception ee ) {
                _LOG.error( ee.getMessage(), ee );
            }
        }
    }
}
