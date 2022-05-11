package C9010_LOOPREFACT;

public class LOOPREFACT_BAD {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // noncompliant, loop only executes once
            System.out.println("i is " + i);
            break;
        }
        //...
        for (int i = 0; i < 10; i++) { // noncompliant, loop only executes once
            int x = 5;
            if (i == x) {
                break;
            }
            else {
                System.out.println("i is " + i);
                return;
            }
        }
    }
}
