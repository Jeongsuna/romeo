package C80D2_MissingStaticMethodInNonIns;

public class MissingStaticMethodInNonInstantiatableClass_BAD {
    public class Foo {
        private Foo() {}
        void foo() {}
    }
}
