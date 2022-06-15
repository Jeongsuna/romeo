package C8047_LocalVariableNamingConventi;

public class VariableNamingConventions_BAD {
    class TestClass {
        void fooMethod() {
            int local_var = 1;
            final int final_val = 1;
            try {
                varMethod();
            } catch (IllegalArgumentException e_illegal) {
            }
        }
        void varMethod(){
        }
    }
}
