package testcases.C6129_VARPERLINE;

public class C6129_VARPERLINE__simple_02 {
    public void bad(){
        int x, y, z; /* Non-compliant */
    }
    public void good(){
        int x; /* Compliant */
        int y; /* Compliant */
        int z; /* Compliant */
    }
}
