package C80F3_DontCallThreadRun;

public class DontCallThreadRun_GOOD {
    public class FooTest extends Thread{
        public void main(String[] args) {
            Thread t = new Thread();
            t.start();
            new Thread().start();
        }
    }
}
