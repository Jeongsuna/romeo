package testcases.C6126_NOBRAINIF;

public class C6126_NOBRAINIF__simple_01 {
    public void bad(){
        int money = 2000;

        /* Non-compliant */
        if (money >= 3000)
            System.out.println("more than 3000");
        System.out.println("more than 3000");
    }
    public void good(){
        int money = 2000;

        /* Compliant */
        if (money >= 3000) {
            System.out.println("more than 3000");
        }
        System.out.println("more than 3000");
    }
}
