package C80C5_FinalizeShouldBeProtected;

public class FinalizeShouldBeProtected_GOOD {
    protected void finalize() {
        something();
    }

    private void something() {
    }
}
