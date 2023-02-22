package C9089_SYNCSTATE__SynchronizedStatement;

public class C9089_SYNCSTATE_SynchronizedStatement_bad {
    public synchronized void badMethod1() { // @violation

    }

    public void badMethod2() {
        synchronized (this) { // @violation

        }
    }
}
