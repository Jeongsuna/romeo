package C9002_REDUPARENTHES;

public class C9002_REDUPARENTHES_good {
    boolean x;
    int i;
    int j;

    public void good() {

        // Compliant
        if (x && (i+j >= 0)) {

        }
    }

}
