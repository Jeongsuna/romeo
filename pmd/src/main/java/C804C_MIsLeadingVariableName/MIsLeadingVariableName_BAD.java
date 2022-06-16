package C804C_MIsLeadingVariableName;

public class MIsLeadingVariableName_BAD {
    public class Foo {
        private int m_foo;
        public void bar(String m_param) {
            int m_var = 42;
        }
    }
}
