package testcases.C00A9_UNCONTRES__CWE400;

import java.util.concurrent.Executor;

public class C00A9_UNCONTRES__Runnable_bad_02 implements Executor {


    public void execute(Runnable r) {

        try {
        }
        catch (InterruptedException ie) {

// postpone response
            Thread.currentThread().interrupt();
        }
    }

    protected void activate() {

        Runnable loop = new Runnable() {

            public void run() {

                try {
                    for (int i = 0; i < 10; i++) {
                        Runnable r = new MyRunnable();
                        r.run();
                    }
                }
                catch (InterruptedException ie) {

                }
            }
        };
        new Thread(loop).start();
    }

}
