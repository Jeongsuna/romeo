package testcases.C6111_VARMULTASSIGN;

public class C6111_VARMULTASSIGN__simple_01 {
    public void bad(){
        int num1, num2, num3 = 7; /* Non-compliant */
    }
    public void good(){
        int num1 = 7; /* Compliant */
        int num2 = 7; /* Compliant */
        int num3 = 7; /* Compliant */
    }
}
