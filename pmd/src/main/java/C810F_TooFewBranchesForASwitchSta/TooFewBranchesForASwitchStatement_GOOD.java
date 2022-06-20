package C810F_TooFewBranchesForASwitchSta;

public class TooFewBranchesForASwitchStatement_GOOD {
    public class Foo {
        private String ONE = "";
        String condition;

        public void bar() {
            if(condition.equals(ONE)){
                instruction();
            }else{
            }
        }
        private void instruction() {
        }
    }
}
