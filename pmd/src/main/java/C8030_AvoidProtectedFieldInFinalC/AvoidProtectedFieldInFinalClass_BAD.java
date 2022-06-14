package C8030_AvoidProtectedFieldInFinalC;

public class AvoidProtectedFieldInFinalClass_BAD {
    public final class Foo {
        private int a;
        protected int b;
        Foo() {}
    }
}
