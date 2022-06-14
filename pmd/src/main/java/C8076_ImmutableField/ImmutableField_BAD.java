package C8076_ImmutableField;

public class ImmutableField_BAD {
    public class Test {
        private int a;
        public void Bar() {
            a = 7;
        }
        public void bar() {
            int x = a + 2;
        }
    }
}
