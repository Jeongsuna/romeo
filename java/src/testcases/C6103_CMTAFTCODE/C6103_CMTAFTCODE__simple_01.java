package testcases.C6103_CMTAFTCODE;

public class C6103_CMTAFTCODE__simple_01 {
    public void bad(){
        System.out.println("hello world1");// Non-compliant - No space
    }
    public void good(){
        System.out.println("hello world1"); // Compliant
        System.out.println("hello world1");    // Compliant
    }
}
