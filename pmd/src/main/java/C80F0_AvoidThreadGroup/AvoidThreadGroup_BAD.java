package C80F0_AvoidThreadGroup;

public class AvoidThreadGroup_BAD {
    public class Bar {
        void buz() {
            ThreadGroup tg = new ThreadGroup("My threadgroup");
            tg = new ThreadGroup(tg, "my thread group");
            tg = Thread.currentThread().getThreadGroup();
            tg = System.getSecurityManager().getThreadGroup();
        }
    }
}
