package C80C3_FinalizeOnlyCallsSuperFinal;

public class FinalizeOnlyCallsSuperFinalize_GOOD {
    protected void finalize() throws Throwable {
        super.finalize();
        something();
    }

    private void something() {
    }
}
