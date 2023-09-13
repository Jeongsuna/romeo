package testcases.C610B_INITLOCALV;

public class C610B_INITLOCALV__simple_01 {
    public void bad(){
        int h; /* Non-compliant */
        int w; /* Non-compliant */
    }
    public void good(){
        int h = 100; /* Compliant */
        int w = 50; /* Compliant */
    }
}
