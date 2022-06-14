package C800A_DefaultLabelNotLastInSwitch;

public class DefaultLabelNotLastInSwitchStmt_BAD {
    public class Test {
        void foo(int bar) {
            switch (bar) {
                case 1:
                    break;
                default:
                    break;
                case 2:
                    break;
            }
        }
    }
}
