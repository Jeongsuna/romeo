package C8034_CallSuperInConstructor;

public class CallSuperInConstructor_GOOD {
    public class Bar extends Foo{
        public Bar() {
            super();
        }
    }
    private class Foo {
    }
}
