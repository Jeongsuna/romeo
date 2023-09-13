package testcases.C6107_INDFORSTMT;

public class C6107_INDFORSTMT__simple_02 {
    public void bad(){
        int condition2 = 0;
        boolean condition3 = false;

        /* Non-compliant */
        for(int aa = 0; (aa < 5) && (condition2 ==
                0) && (condition3 == true); aa++) {
            System.out.println(aa);
        }
    }
    public void good(){
        int condition2 = 0;
        boolean condition3 = false;

        /* Compliant */
        for(int condition1=0; (condition1 < 5)
                && (condition2 == 0)
                && (condition3 == true); condition1++) {
        }
    }
}
