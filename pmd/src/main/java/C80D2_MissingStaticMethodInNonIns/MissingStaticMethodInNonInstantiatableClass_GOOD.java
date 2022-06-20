package C80D2_MissingStaticMethodInNonIns;

public class MissingStaticMethodInNonInstantiatableClass_GOOD {
    public static class Foo {
        Foo() {}
        static void foo() {}
    }
}
