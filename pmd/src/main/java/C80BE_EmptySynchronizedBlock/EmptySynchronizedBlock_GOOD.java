package C80BE_EmptySynchronizedBlock;

public class EmptySynchronizedBlock_GOOD {
    public class Foo {
        public void bar() {
            synchronized (this) {
                int x = 10;
            }
        }
    }
}
