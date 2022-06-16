package C8036_CommentDefaultAccessModifie;

public class CommentDefaultAccessModifie_GOOD {
    public class Foo {
        private final String stringValue = "some string";
        private String getString() {
            return stringValue;
        }
        public class NestedFoo {
        }
    }
}
