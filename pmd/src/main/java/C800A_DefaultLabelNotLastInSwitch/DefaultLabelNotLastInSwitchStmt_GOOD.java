package C800A_DefaultLabelNotLastInSwitch;

public class DefaultLabelNotLastInSwitchStmt_GOOD {
    public class Test {
        void foo(int bar) {
            switch (bar) {
                case 1:
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        }
    }
}
