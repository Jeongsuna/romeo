package C9010_LOOPREFACT;

public class LOOPREFACT_GOOD {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i is " + i);
        }
        //...
        for (int i = 0; i < 10; i++) {
            int x = 5;
            if (i == x) {
                break;
            }
            else {
                System.out.println("i is " + i);
            }
        }
    }
}
