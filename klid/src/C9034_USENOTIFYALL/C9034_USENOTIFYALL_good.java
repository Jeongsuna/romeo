package C9034_USENOTIFYALL;

public class C9034_USENOTIFYALL_good extends Thread{

    @Override
    public void run(){
        synchronized(this){
            // ...
            notifyAll();
        }
    }

}
