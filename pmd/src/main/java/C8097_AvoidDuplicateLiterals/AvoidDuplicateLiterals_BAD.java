package C8097_AvoidDuplicateLiterals;

public class AvoidDuplicateLiterals_BAD {
    private void bar() {
        buz("Howdy");
        buz("Howdy");
        buz("Howdy");
        buz("Howdy");
    }
    private void buz(String x) {}
}
