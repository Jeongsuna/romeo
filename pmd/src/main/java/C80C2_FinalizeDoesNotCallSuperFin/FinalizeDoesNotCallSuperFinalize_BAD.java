package C80C2_FinalizeDoesNotCallSuperFin;

public class FinalizeDoesNotCallSuperFinalize_BAD {
    protected void finalize() {
        something();
    }

    private void something() {
    }
}
