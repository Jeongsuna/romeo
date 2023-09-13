package testcases.C611D_USEOTHERINT;

public class C611D_USEOTHERINT__simple_01 {
    public int bad(){

        /* Non-compliant */
        return 30;
    }
    public int good1(){

        /* Compliant */
        return -1;
    }

    public int good2(){

        /* Compliant */
        return 0;
    }

    public int good3(){

        /* Compliant */
        return 1;
    }
}
