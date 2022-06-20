package C80F8_UseNotifyAllInsteadOfNotify;

public class UseNotifyAllInsteadOfNotify_GOOD {
    public class TestFoo extends Thread{
        Thread x = new Thread();
        void bar() {
            x.notifyAll();
        }
    }
}
