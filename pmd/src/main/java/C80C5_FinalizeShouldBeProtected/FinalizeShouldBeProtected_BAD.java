package C80C5_FinalizeShouldBeProtected;

public class FinalizeShouldBeProtected_BAD {
    @Override
    public void finalize() {
        something();
    }

    private void something() {
    }
}
