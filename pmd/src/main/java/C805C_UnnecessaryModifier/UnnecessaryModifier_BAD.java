package C805C_UnnecessaryModifier;

public class UnnecessaryModifier_BAD {
    public @interface Annotation {
        public abstract boolean bar();
        public static final int X = 0;
        public static class Bar {}
        public static interface Baz {}
    }
}
