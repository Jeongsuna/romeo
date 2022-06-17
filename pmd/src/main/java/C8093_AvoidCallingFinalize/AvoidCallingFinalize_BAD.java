package C8093_AvoidCallingFinalize;

public class AvoidCallingFinalize_BAD {
    void foo() {
        Bar b = new Bar();
        b.finalize();
    }
    public class Bar{
        public void finalize(){}
    }
}
