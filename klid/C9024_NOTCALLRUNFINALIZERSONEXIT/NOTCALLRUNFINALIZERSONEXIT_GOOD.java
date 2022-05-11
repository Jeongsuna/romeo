package C9024_NOTCALLRUNFINALIZERSONEXIT;

public class NOTCALLRUNFINALIZERSONEXIT_GOOD {
    public static void main(String [] args) {

        Runnable shutdownHook = new Runnable() {
            public void run() {
                doSomething();
            }
        };
        Runtime.getRuntime().addShutdownHook(new Thread(shutdownHook));
    }
    private static void doSomething() {
    }
}
