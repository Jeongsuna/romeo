package C80C5_FinalizeShouldBeProtected;

public class FinalizeShouldBeProtected_BAD {
    public void finalize() {
        something();
    }

    private void something() {
    }
}
