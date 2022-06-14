package C80C1_EqualsNull;

public class EqualsNull_GOOD {
    class Foo {
        void testMethod() {
            String a = "test";
            if (a == null) {
                bar();
            }
        }

        private void bar() {
        }
    }
}
