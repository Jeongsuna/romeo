package C80F2_DoNotUseThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DoNotUseThreads_BAD {
    public class UsingThread extends Thread {
    }
    public class UsingExecutorService {
        public void methodX() {
            ExecutorService executorService = Executors.newFixedThreadPool(5);
        }
    }
    public class UsingExecutors {
        public void methodX() {
            Executors.newSingleThreadExecutor().submit(() -> System.out.println("Hello!"));
        }
    }
}
