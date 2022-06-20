package C80F5_NonThreadSafeSingleton;

public class NonThreadSafeSingleton_GOOD {
    public static class Foo{
        private static Foo foo = null;
        public synchronized static Foo getFoo() {
            if (foo==null) {
                foo = new Foo();
            }
            return foo;
        }
    }
}
