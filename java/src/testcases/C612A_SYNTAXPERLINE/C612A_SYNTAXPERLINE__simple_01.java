package testcases.C612A_SYNTAXPERLINE;

public class C612A_SYNTAXPERLINE__simple_01 {
    public void bad(){
        System.out.println("hello world!"); System.out.println("hello world!"); /* Non-compliant */
    }
    public void good(){
        System.out.println("hello world!");
        System.out.println("hello world!"); /* Compliant */
    }
}
