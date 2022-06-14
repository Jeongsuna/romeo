package C8076_ImmutableField;

public class ImmutableField_GOOD {
    public class Test {
        private final int a;

        public Test(int a) {
            this.a = a;
        }

        public void Bar() {
            new Test(7);
        }
        public void bar() {
            int x = a + 2;
        }
    }
}
