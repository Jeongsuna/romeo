package testcases.C6101_CMTEOL;

public class C6101_CMTEOL__simple_01 {
    public void bad(){
        boolean flag = true;
        int i = 0;
        String s = "";

        /* Non-compliant */
        if (flag) {
            flag = false;
        }

        /* Non-compliant */
        for(i=0; i<5; i++) {
            i += 3;
        }

        /* Non-compliant */
        while(i<5) {
            i++;
        }

        /* Non-compliant */
        do {
            i++;
        } while (i<5);

        /* Non-compliant */
        switch (i) {
            case 1:
                s = "one";
                break;

            case 2:
                s = "two";
                break;

            case 3:
                s = "three";
                break;

            case 4:
                s = "four";
                break;

            default:
                s = "zero";
                break;
        }
    }

    public void good(){
        boolean flag = true;
        int i = 0;
        String s = "";

        /* Compliant */
        if (flag) {
            flag = false;
        } // end-Comment

        /* Compliant */
        for(i=0; i<5; i++) {
            i += 3;
        } // end-Comment

        /* Compliant */
        while (i<5) {
            i++;
        } // end-Comment

        /* Compliant */
        do {
            i++;
        } while (i<5); // end-Comment

        /* Compliant */
        switch (i) {
            case 1:
                s = "one";
                break;

            case 2:
                s = "two";
                break;

            case 3:
                s = "three";
                break;

            case 4:
                s = "four";
                break;

            default:
                s = "zero";
                break;
        } // end-Comment
    }
}
