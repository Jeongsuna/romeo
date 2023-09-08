package testcases.C00A9_UNCONTRES__CWE400;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class C00A9_UNCONTRES__Runnable_good_02 {

    public void good() {
        // Create a fixed-size thread pool with a limit of, say, 5 threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Submit tasks to the thread pool
        for (int i = 0; i < 10; i++) {
            Runnable myRunnable = new MyRunnable();
            executorService.submit(myRunnable);
        }

        // Shutdown the thread pool when no more tasks will be submitted
        executorService.shutdown();
    }

}
