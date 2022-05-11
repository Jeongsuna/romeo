package C9017_FORLOOPINCRE;

public class FORLOOPINCRE_BAD {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 10; j++) {
            // ...
            i++;
        }
    }
}
