package testcases.C6105_INDCLASS;

public class C6105_INDCLASS__simple_01 {
    public void bad(){
    String name; /* Non-compliant */
    int age; /* Non-compliant */
    }
    public void good(){
        String name; /* Compliant */
        int age; /* Compliant */
    }
}
