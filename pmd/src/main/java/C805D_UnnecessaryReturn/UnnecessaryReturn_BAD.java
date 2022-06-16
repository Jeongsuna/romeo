package C805D_UnnecessaryReturn;

public class UnnecessaryReturn_BAD {
    public class Foo {
        public void bar() {
            int x = 42;
            return;
        }
    }
}
