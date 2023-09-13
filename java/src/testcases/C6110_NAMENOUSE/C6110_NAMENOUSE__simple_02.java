package testcases.C6110_NAMENOUSE;

public class C6110_NAMENOUSE__simple_02 {
    public void bad(){
        /* Non-compliant */
        String a;
        String b;
        int q;
    }
    public void good(){
        /* Compliant */
        String bar1;
        String bar2;
        String bar3;

        /* Compliant - except*/
        int i;
        char c;
    }
}
