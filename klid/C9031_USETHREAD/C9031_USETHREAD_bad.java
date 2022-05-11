package C9031_USETHREAD;

public class C9031_USETHREAD_bad {
    public static void bad() {
        Thread t =new Thread() {
            int i;
            @Override
            public void run() {
                while(true)
                    System.out.println("a");
            }
        };
        new Thread(t).start();  // Noncompliant
    }
}
