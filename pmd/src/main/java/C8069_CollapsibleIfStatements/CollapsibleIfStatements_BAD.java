package C8069_CollapsibleIfStatements;

public class CollapsibleIfStatements_BAD {
    void foo() {
        boolean a = true;
        boolean b= true;
        if (a) {
            if (b) {
            }
        }
    }
}
