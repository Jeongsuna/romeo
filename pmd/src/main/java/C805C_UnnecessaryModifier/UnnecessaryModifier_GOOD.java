package C805C_UnnecessaryModifier;

public class UnnecessaryModifier_GOOD {
    public @interface Annotation {
        boolean bar();
        int X = 0;
        class Bar {}
        interface Baz {}
    }
}
