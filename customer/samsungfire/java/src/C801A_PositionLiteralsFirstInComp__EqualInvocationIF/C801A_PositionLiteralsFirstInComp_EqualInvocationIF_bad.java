package C801A_PositionLiteralsFirstInComp__EqualInvocationIF;

public class C801A_PositionLiteralsFirstInComp_EqualInvocationIF_bad {

    public void badMethod(String param) {
            if (param.equals("Test")) { // @violation

            }
    }
}
