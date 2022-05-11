package C901E_ARRAYCALL;

import java.util.Arrays;

public class ARRAYCALL_GOOD {
    public static void main( String[] args ) {
        String argStr = Arrays.toString(args);
        int argHash = Arrays.hashCode(args);
    }
}
