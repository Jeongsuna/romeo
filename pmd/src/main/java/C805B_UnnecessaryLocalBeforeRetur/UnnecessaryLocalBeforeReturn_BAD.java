package C805B_UnnecessaryLocalBeforeRetur;

public class UnnecessaryLocalBeforeReturn_BAD {
    public class Foo {
        public int foo() {
            int x = doSomething();
            return x;
        }
    }

    private int doSomething() {
        return 0;
    }
}
