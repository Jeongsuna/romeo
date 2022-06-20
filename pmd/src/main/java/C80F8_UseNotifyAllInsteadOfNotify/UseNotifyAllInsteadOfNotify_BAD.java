package C80F8_UseNotifyAllInsteadOfNotify;

public class UseNotifyAllInsteadOfNotify_BAD {
    public class TestFoo extends Thread{
        Thread x = new Thread();
        void bar() {
            x.notify();
        }
    }
}
