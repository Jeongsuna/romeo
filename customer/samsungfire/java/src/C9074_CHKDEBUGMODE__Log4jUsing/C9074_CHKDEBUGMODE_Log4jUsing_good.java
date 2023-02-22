package C9074_CHKDEBUGMODE__Log4jUsing;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class C9074_CHKDEBUGMODE_Log4jUsing_good {
    final static Logger logger = LogManager.getLogger(C9074_CHKDEBUGMODE_Log4jUsing_good.class);

    public void goodMethod1(){
        if (logger.isDebugEnabled()) { // @fixed
            logger.debug("12345");
        }
    }

    public void goodMethod2() {
        if (logger.isInfoEnabled()) { // @fixed
            logger.info("12345");
        }
    }
}
