package testcases.C6104_COMPBRACE;

public class C6104_COMPBRACE__while_01 {

    public void bad(String[] args) {
        int foo = 0;

        while (foo > 30000) {
            System.out.println("Over 30000");
    } /* Non-compliant - Indentation */
    }

    public void good(String[] args) {
        int foo = 0;

        while (foo > 30000) {
            System.out.println("Over 30000");
        } /* Compliant - Indentation */
    }
}

