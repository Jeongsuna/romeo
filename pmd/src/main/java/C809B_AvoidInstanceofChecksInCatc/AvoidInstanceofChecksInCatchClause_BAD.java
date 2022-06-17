package C809B_AvoidInstanceofChecksInCatc;

public class AvoidInstanceofChecksInCatchClause_BAD {
    public static void main(String[] args) {
        try {
        } catch (Exception ee) {
            if (ee instanceof NullPointerException) {
                ee.printStackTrace();
            }
        }
    }
}
