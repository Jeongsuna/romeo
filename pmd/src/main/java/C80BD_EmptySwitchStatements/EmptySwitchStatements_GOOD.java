package C80BD_EmptySwitchStatements;

public class EmptySwitchStatements_GOOD {
    public void bar() {
        int x = 2;
        switch (x) {
            case 2:
                x += 2;
                break;
            default:
                x += 4;
                break;
        }
    }
}
