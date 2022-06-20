package C80F3_DontCallThreadRun;

public class DontCallThreadRun_BAD {
    public class FooTest extends Thread{
        public void main(String[] args) {
            Thread t = new Thread();
            t.run();
            new Thread().run();
        }
    }
}
