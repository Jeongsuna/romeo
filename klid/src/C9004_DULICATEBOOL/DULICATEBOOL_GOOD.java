package C9004_DULICATEBOOL;

public class DULICATEBOOL_GOOD {
    public static void main(String[] args) {
        if (boolTest()) { /* ... */ }
        doLogic(true);
        boolean boolVar;
        boolean exp = false;
        boolVar = !boolTest() || exp;
    }

    private static void doLogic(boolean b) {
    }

    private static boolean boolTest() {
        return false;
    }

}