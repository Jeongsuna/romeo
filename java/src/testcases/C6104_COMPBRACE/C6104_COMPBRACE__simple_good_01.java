package testcases.C6104_COMPBRACE;

public class C6104_COMPBRACE__simple_good_01 {

    public void main(String[] args) {
        int foo = 0;

        if (foo > 30000) {
            System.out.println("Over 30000");
        } /* Compliant - Indentation */
    }
}
