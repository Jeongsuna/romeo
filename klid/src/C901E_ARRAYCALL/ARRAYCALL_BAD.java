package C901E_ARRAYCALL;

public class ARRAYCALL_BAD {
    public static void main( String[] args ) {
        String str = args.toString(); // Noncompliant
        int hash = args.hashCode(); // Noncompliant
    }
}
