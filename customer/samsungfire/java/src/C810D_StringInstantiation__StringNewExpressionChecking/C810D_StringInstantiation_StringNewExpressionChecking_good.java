package C810D_StringInstantiation__StringNewExpressionChecking;

public class C810D_StringInstantiation_StringNewExpressionChecking_good {

    public void badMethod() {
        String val = new String("Argument"); // @violation
    }
}
