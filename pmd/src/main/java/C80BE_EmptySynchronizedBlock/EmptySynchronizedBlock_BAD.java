package C80BE_EmptySynchronizedBlock;

public class EmptySynchronizedBlock_BAD {
    public class Foo {
        public void bar() {
            synchronized (this) {
            }
        }
    }
}
