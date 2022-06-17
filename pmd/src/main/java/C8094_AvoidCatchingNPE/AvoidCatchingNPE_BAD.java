package C8094_AvoidCatchingNPE;

public class AvoidCatchingNPE_BAD {
    public class Foo {
        void bar() {
            try {
                // do something
            } catch (NullPointerException npe) {
            }
        }
    }
}
