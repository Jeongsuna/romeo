package C809D_AvoidLosingExceptionInforma;

public class AvoidLosingExceptionInformation_GOOD {
    public void bar() {
        try {
        } catch (Exception se) {
            String exception = se.toString();
            System.out.println(exception);
        }
    }
}
