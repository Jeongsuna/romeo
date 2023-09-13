package testcases.C6121_NOPARRETINCON;

public class C6121_NOPARRETINCON__simple_01 {
    public int bad1(int x, int y) {
        char input = '+';

        if (input == '+')
            return x + y; /* Non-compliant */
        else
            return x - y; /* Non-compliant */
    }

    public int bad2(int x, int y) {
        char input = '-';

        switch (input) {
            case '+':
                return x + y; /* Non-compliant */

            case '-':
                return x - y; /* Non-compliant */

            default:
                return 0;
        }
    }

    public int good1(int x, int y) {
        char input = '+';

        if (input == '+')
            return (x + y); /* Compliant */
        else
            return (x - y); /* Compliant */
    }

    public int good2(int x, int y) {
        char input = '-';

        switch (input) {
            case '+':
                return (x + y); /* Compliant */

            case '-':
                return (x - y); /* Compliant */

            default:
                return 0;
        }
    }
}
