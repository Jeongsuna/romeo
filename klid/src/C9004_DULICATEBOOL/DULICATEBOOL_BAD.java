package C9004_DULICATEBOOL;

public class DULICATEBOOL_BAD {
    public static void main(String[] args) {
        if (boolTest() == true) { /* ... */ }
        doLogic(boolTest() == true);
        boolean boolVar;
        boolean exp = false;
        boolVar = boolTest() ? exp : true;
    }

    private static void doLogic(boolean b) {
    }

    private static boolean boolTest() {
        return false;
    }
}
