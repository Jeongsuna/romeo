package C8094_AvoidCatchingNPE;

public class AvoidCatchingNPE_GOOD {
    public class Foo {
        void bar() {
            try {
                // do something
            } catch (Exception e) {
            }
        }
    }
}
