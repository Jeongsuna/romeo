package C805B_UnnecessaryLocalBeforeRetur;

public class UnnecessaryLocalBeforeReturn_GOOD {
    public class Foo {
        public int foo() {
            return doSomething();
        }
    }

    private int doSomething() {
        return 0;
    }
}
