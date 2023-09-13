package testcases.C6108_INDIFSTMT;

public class C6108_INDIFSTMT__simple_01 {
    public void bad(){
        int i = 0;
        if (i<5){
        System.out.println(i); /* Non-compliant */
        }
    }
    public void good(){
        int i = 0;
        if (i<5){
            System.out.println(i); /* Compliant - Indentation */
        }
    }
}
