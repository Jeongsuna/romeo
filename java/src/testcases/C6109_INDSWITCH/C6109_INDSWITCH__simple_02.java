package testcases.C6109_INDSWITCH;

public class C6109_INDSWITCH__simple_02 {
    public void bad(){
        int i = 0;

        /* Non-compliant */
        switch
        (i) {
            case 1: System.out.println(1);
                break;
            case 2: System.out.println(2);
                break;
            case 3: System.out.println(3);
                break;
            case 4: System.out.println(4);
                break;
            default: System.out.println(i);
                break;
        }
    }
    public void good(){
        int i = 0;

        /* Compliant */
        switch (i) {
            case 1: System.out.println(1);
                break;
            case 2: System.out.println(2);
                break;
            case 3: System.out.println(3);
                break;
            case 4: System.out.println(4);
                break;
            default: System.out.println(i);
                break;
        }
    }
}
