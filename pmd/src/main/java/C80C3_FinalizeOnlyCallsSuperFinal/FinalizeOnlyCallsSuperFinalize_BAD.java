package C80C3_FinalizeOnlyCallsSuperFinal;

public class FinalizeOnlyCallsSuperFinalize_BAD {
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
