package testcases.C6104_COMPBRACE;

public class C6104_COMPBRACE__for_01 {

    public void bad(String[] args) {
        for (int i = 0; i > 30000; i++) {
            System.out.println("i: " + i);
    } /* Non-compliant - Indentation */
    }

    public void good(String[] args) {
        for (int i = 0; i > 30000; i++) {
            System.out.println("i: " + i);
        } /* Compliant - Indentation */
    }
}

