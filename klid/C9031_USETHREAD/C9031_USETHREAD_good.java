package C9031_USETHREAD;

public class C9031_USETHREAD_good {
    public static void good() {
        Runnable r =new Runnable() {
            int i;
            @Override
            public void run() {
                while(true)
                    System.out.println("a");
            }
        };
        new Thread(r).start();
    }
}
