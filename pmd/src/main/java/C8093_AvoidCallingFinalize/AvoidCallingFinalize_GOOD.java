package C8093_AvoidCallingFinalize;

public class AvoidCallingFinalize_GOOD {
    void foo() {
        Bar b = new Bar();
        // Do not use finalize()
    }
    public class Bar{
    }
}
