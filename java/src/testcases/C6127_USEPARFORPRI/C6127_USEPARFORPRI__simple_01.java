package testcases.C6127_USEPARFORPRI;

public class C6127_USEPARFORPRI__simple_01 {
    public void bad(){
        int num1 = 10, num2 = 5, num3 = 2;
        int result = num1 + num2 * num3; /* Non-compliant - want to plus first */
    }
    public void good(){
        int num1 = 10, num2 = 5, num3 = 2;
        int result = (num1 + num2) * num3; /* Compliant */
        int result2 = num1 * num2 + num3; /* Compliant */
    }
}
