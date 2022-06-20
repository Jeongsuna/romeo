package C80C2_FinalizeDoesNotCallSuperFin;

public class FinalizeDoesNotCallSuperFinalize_GOOD {
    protected void finalize() throws Throwable {
        something();
        super.finalize();
    }
    private void something() {
    }
}
