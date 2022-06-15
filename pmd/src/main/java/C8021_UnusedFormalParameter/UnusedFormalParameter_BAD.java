package C8021_UnusedFormalParameter;

public class UnusedFormalParameter_BAD {
    public class TestClass {
        private void foo(String par1, String par2) {
            String var = par1;
        }
    }
}
