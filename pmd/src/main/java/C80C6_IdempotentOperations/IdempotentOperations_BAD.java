package C80C6_IdempotentOperations;

public class IdempotentOperations_BAD {
    public class Foo {
        public void bar() {
            int x = 2;
            x = x;
        }
    }
}
