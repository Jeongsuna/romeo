package C8097_AvoidDuplicateLiterals;

public class AvoidDuplicateLiterals_GOOD {
    private final static String FOO = "Howdy";
    private void bar() {
        buz(FOO);
        buz(FOO);
        buz(FOO);
        buz(FOO);
    }
    private void buz(String x) {}
}
