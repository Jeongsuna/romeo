package testcases.C6118_BKSWITCH;

public class C6118_BKSWITCH__simple_01 {
    public void bad(){
        int i = 0;

        switch(i){ /* Non-compliant */
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3: /* Non-compliant */
                System.out.println(3);
            case 4:
                System.out.println(4);
                break;
            /* Non-compliant */
        }
    }
    public void good(){
        int i = 0;

        switch (i) { /* Compliant */
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3: /* Compliant */
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            default: /* Compliant */
                System.out.println(i);
                break;
        }
    }
}
