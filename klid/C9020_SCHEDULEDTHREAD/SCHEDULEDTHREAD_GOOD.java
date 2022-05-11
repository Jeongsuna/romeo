package C9020_SCHEDULEDTHREAD;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class SCHEDULEDTHREAD_GOOD {
    public void method(){

        ScheduledThreadPoolExecutor stp1 = new ScheduledThreadPoolExecutor(1); // Compliant


        int POOL_SIZE = 1;
        ScheduledThreadPoolExecutor stp2 = new ScheduledThreadPoolExecutor(POOL_SIZE);
        stp2.setCorePoolSize(5);  // Compliant

        //...
    }
}
