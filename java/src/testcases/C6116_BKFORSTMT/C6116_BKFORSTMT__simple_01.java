package testcases.C6116_BKFORSTMT;

public class C6116_BKFORSTMT__simple_01 {
    public void bad(){
        /* Non-compliant */
        for(int i=0;i<4;i++) {
            System.out.println(i);
        }
    }
    public void good(){
        /* Compliant */
        for(int i=0; i<4; i++) {
            System.out.println(i);
        }
    }
}
