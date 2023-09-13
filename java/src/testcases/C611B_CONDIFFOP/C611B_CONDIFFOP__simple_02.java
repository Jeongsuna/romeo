package testcases.C611B_CONDIFFOP;

public class C611B_CONDIFFOP__simple_02 {
    public void bad(){
        int a = 5 > 4 ? 50 : 40; /* Non-compliant */
    }

    public void good(){
        int a = (5 > 4) ? 50 : 40; /* Compliant */
    }
}
