package C9020_SCHEDULEDTHREAD;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class SCHEDULEDTHREAD_BAD {
    public void method(){

        ScheduledThreadPoolExecutor stp1 = new ScheduledThreadPoolExecutor(0); // Noncompliant


        int POOL_SIZE = 1;
        ScheduledThreadPoolExecutor stp2 = new ScheduledThreadPoolExecutor(POOL_SIZE);
        stp2.setCorePoolSize(0);  // Noncompliant

        //...
    }
}
