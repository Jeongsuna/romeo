package C9088_STRNEWEXPRCHK__StringNewExpressionChecking;

public class C9088_STRNEWEXPRCHK_StringNewExpressionChecking_good {

    public void badMethod() {
        String val = new String("Argument"); // @violation
    }
}
