package C810F_TooFewBranchesForASwitchSta;

public class TooFewBranchesForASwitchStatement_BAD {
    public class Foo {
        private final String ONE = "";
        String condition;

        public void bar() {
            switch (condition) {
                case ONE:
                    instruction();
                    break;
                default:
                    break;
            }
        }
        private void instruction() {
        }
    }
}
