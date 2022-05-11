package C903C_DONTCALLWAIT;

public class DONTCALLWAIT_Bad extends Thread {

    Thread thr1 = new DONTCALLWAIT_Bad();
    Thread thr2 = new DONTCALLWAIT_Bad();

    void method(){
        synchronized (this.thr1) {  // threadB can't enter this block to request this.thr2 lock & release threadA
            synchronized (this.thr2) {
                try {
                    this.thr2.wait();  // Noncompliant; threadA is stuck here holding lock on this.thr1
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
