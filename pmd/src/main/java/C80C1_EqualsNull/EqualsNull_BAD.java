package C80C1_EqualsNull;

public class EqualsNull_BAD {
    class Foo {
        void testMethod() {
            String a = "test";
            if (a.equals(null)) {
                bar();
            }
        }

        private void bar() {
        }
    }
}
