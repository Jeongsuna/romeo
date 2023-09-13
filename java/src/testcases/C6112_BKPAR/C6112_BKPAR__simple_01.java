package testcases.C6112_BKPAR;

public class C6112_BKPAR__simple_01 {
    public void work(int hour, int amount){
    }

    public void bad(){
        int amount = 0;

        /* Non-compliant */
        int hour = ( 18-9 )*5;

        /* Non-compliant */
        work( hour, amount );

        /* Non-compliant */
        work (hour, amount);
    }

    public void good(){
        int amount = 0;

        /* Compliant - No Space */
        int hour = (18-9)*5;

        /* Compliant - No Space */
        work(hour, amount);

        /* Compliant - No Space */
        work(hour, amount);
    }
}
