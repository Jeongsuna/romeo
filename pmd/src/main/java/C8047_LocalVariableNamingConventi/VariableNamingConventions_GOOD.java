package C8047_LocalVariableNamingConventi;

public class VariableNamingConventions_GOOD {
    class TestClass {
        void fooMethod() {
            int localvar = 1;
            final int FINALVAR = 1;
            try {
                varMethod();
            } catch (IllegalArgumentException eillegal) {
            }
        }
        void varMethod(){
        }
    }
}
