package C9013_SYNCINSTANC;

public class SYNCINSTANC_GOOD {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();
    private static final Object lock3 = new Object();
    private static final Object lock4 = new Object();

    public void foo() {

        synchronized (lock1) {
            // ...
        }
        synchronized (lock2) {
            // ...
        }
        synchronized (lock3) {
            // ...
        }
        synchronized (lock4) {
            // ...
        }
    }
}
