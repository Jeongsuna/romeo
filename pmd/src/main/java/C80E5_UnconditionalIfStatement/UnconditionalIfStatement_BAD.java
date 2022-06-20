package C80E5_UnconditionalIfStatement;

public class UnconditionalIfStatement_BAD {
    public class Foo {
        public void close() {
            if (true) {
                // ...
            }
        }
    }
}
