package C8036_CommentDefaultAccessModifie;

public class CommentDefaultAccessModifie_BAD {
    public class Foo {
        final String stringValue = "some string";
        String getString() {
            return stringValue;
        }
        class NestedFoo {
        }
    }
}
