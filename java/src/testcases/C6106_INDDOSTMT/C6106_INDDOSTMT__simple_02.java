package testcases.C6106_INDDOSTMT;

public class C6106_INDDOSTMT__simple_02 {
    public void bad(){
        int i = 0 ;

        /* Non-compliant */
        do
        {
            System.out.println(i);
            i++;
        } while (i<5);
    }

    public void good(){
        int i = 0 ;

        /* Compliant */
        do {
            System.out.println(i);
            i++;
        } while (i<5);
    }
}
