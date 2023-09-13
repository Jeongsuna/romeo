package testcases.C6114_BKCASTING;

public class C6114_BKCASTING__simple_01 {
    public void bad(){
        long ll = 1000;

        int ii = (int)ll; /* Non-compliant */
        short ss = (short)ll; /* Non-compliant */
        byte bb = (byte)ll; /* Non-compliant */
    }
    public void good(){
        long ll = 1000;

        int ii = (int) ll; /* Compliant - space */
        short ss = (short) ll; /* Compliant - space */
        byte bb = (byte) ll; /* Compliant - space */
    }
}
