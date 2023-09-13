package testcases.C610A_INDTRYSTMT;

public class C610A_INDTRYSTMT__simple_01 {
    public void bad(){
        int i = 0;

        try {
        i = 4 / 0; /* Non-compliant */
        } catch (ArithmeticException e) {
        i = -1; /* Non-compliant */
        } finally {
        System.out.println(i); /* Non-compliant */
        }
    }
    public void good(){
        int i = 0;

        try {
            i = 4 / 0; /* Compliant - Indentation */
        } catch (ArithmeticException e) {
            i = -1; /* Compliant - Indentation */
        } finally {
            System.out.println(i); /* Compliant - Indentation */
        }
    }
}
