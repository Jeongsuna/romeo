package testcases.C6115_BKCOMMA;

public class C6115_BKCOMMA__simple_01 {
    public int bad(int a , int b){ /* Non-compliant */
        return a+b;
    }
    public int good(int a, int b){ /* Compliant */
        return a+b;
    }
}
