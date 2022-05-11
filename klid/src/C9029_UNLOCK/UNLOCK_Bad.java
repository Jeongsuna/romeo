package C9029_UNLOCK;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class UNLOCK_Bad {
    public void doLock() {
        Lock l = new Lock() {
            @Override
            public void lock() {

            }

            @Override
            public void lockInterruptibly() throws InterruptedException {

            }

            @Override
            public boolean tryLock() {
                return false;
            }

            @Override
            public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
                return false;
            }

            @Override
            public void unlock() {

            }

            @Override
            public Condition newCondition() {
                return null;
            }
        };
        l.lock(); // Noncompliant
        if (isInitialized()) {
            // ...
            l.unlock();
        }
    }

    public boolean isInitialized(){
        return true;
    }
}
