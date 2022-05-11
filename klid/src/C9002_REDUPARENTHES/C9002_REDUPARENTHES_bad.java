package C9002_REDUPARENTHES;

public class C9002_REDUPARENTHES_bad {

    boolean x;
    int i;
    int j;

    public void bad() {
        // Non-Compiant
        if (x && (((i + j) >= 0))) {
            /* use two parentheses */
        }
    }

}
