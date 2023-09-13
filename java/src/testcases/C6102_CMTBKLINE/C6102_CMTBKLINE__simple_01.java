package testcases.C6102_CMTBKLINE;

public class C6102_CMTBKLINE__simple_01 {
    public void bad(){
        System.out.println("hello world1");

    // Non-compliant #1
        System.out.println("hello world2");

        System.out.println("hello world3");
        // Non-compliant #2
        System.out.println("hello world4");
    }
    public void good(){
        System.out.println("hello world1");

        // Compliant #1
        System.out.println("hello world2");
    }
}
