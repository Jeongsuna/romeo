package C8081_SimplifyConditional;

public class SimplifyConditional_BAD {
    class Foo {
        void bar(Object x) {
            if (x != null && x instanceof Bar) {
            }
        }
    }
    private class Bar{}
}
