package C902A_NOTRETURNNULL;

public class NOTRETURNNULL_Bad {
    private String collection;

    public String toString() {
        if (this.collection.isEmpty()) {
            return null; // Noncompliant
        } else {
            // ...
            return null;
        }
    }
}
