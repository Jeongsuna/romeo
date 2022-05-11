package C9034_USENOTIFYALL;

public class C9034_USENOTIFYALL_bad extends Thread{
    @Override
    public void run(){
        synchronized(this){
            // ...
            notify();  // Noncompliant
        }
    }

}
