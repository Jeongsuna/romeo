package C80C5_FinalizeShouldBeProtected;

public class FinalizeShouldBeProtected_GOOD {
    @Override
    protected void finalize() {
        something();
    }

    private void something() {
    }
}
