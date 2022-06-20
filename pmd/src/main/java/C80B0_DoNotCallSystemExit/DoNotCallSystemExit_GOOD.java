package C80B0_DoNotCallSystemExit;

public class DoNotCallSystemExit_GOOD {
    public void bar() {
        Runtime.getRuntime().exit(0);
    }
}
