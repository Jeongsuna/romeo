package C801F_SwitchStmtsShouldHaveDefaul;

public class SwitchStmtsShouldHaveDefaul_BAD {
    public class Test {
        public void Foo() {
            int a = 2;
            switch (a) {
                case 2:
                    int b = 8;
            }
        }
    }
}
