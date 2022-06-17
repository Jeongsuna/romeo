package C809D_AvoidLosingExceptionInforma;

public class AvoidLosingExceptionInformation_BAD {
    public void bar() {
        try {
        } catch (Exception se) {
            se.toString();
        }
    }
}
