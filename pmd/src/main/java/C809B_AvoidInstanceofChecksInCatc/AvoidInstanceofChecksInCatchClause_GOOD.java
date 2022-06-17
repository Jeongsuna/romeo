package C809B_AvoidInstanceofChecksInCatc;

public class AvoidInstanceofChecksInCatchClause_GOOD {
    public static void main(String[] args) {
        try {
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
