package C802E_AvoidFinalLocalVariable;

public class AvoidFinalLocalVariable_BAD {
    public class TestClass {
        public void testMethod() {
            final String FINALLOCALVAR;
        }
    }
}
