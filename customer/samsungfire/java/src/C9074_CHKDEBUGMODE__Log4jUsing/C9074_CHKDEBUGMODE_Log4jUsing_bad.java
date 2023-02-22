package C9074_CHKDEBUGMODE__Log4jUsing;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class C9074_CHKDEBUGMODE_Log4jUsing_bad {
    final static Logger logger = LogManager.getLogger(C9074_CHKDEBUGMODE_Log4jUsing_bad.class);

    public void badMethod1(){
        logger.info("*******************");  // @violation logger have to have if statement
        logger.info(" BankTransferCnt START ");
    }

    public void badMethod2(){
        if(logger.isDebugEnabled()) {  // @violation logger is info but if condition is DebugEnabled
            logger.info("*******************");
            logger.info(" BankTransferCnt START ");
        }
    }
}
