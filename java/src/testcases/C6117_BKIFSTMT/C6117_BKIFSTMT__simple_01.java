package testcases.C6117_BKIFSTMT;

public class C6117_BKIFSTMT__simple_01 {
    public void bad(){
        int i = 0;

        /* Non-compliant */
        if(i==0){
            System.out.println(i);
        }
    }
    public void good(){
        int i = 0;

        /* Compliant */
        if (i==0){
            System.out.println(i);
        }
    }
}
