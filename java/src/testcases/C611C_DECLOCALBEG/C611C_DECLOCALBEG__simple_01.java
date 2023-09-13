package testcases.C611C_DECLOCALBEG;

public class C611C_DECLOCALBEG__simple_01 {
    public void bad(){
        System.out.println("local variable shall be declared at the top.");
        int w = 4; /* Non-compliant */
        int h = 7; /* Non-compliant */
    }
    public void good(){
        int w = 4; /* Compliant */
        int h = 7; /* Compliant */
        System.out.println("local variable shall be declared at the top.");
        for(int i=0; i<4; i++) { /* Compliant - Exception */
            System.out.println(i);
        }
    }
}
