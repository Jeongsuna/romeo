package testcases.C6128_LENOVERCOL;

public class C6128_LENOVERCOL__simple_02 {
    public void bad(){
        int[] array = new int[3];
        array[4] = 0; /* Non-compliant */
    }
    public void good(){
        int[] array = new int[3];
        array[2] = 0; /* Compliant */
    }
}
