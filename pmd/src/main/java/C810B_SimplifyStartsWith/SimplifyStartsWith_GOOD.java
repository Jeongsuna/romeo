package C810B_SimplifyStartsWith;

public class SimplifyStartsWith_GOOD {
    public class Foo {
        boolean fasterCheckIt(String x) {
            return !x.isEmpty() && x.charAt(0) == 'a';
        }
    }
}
