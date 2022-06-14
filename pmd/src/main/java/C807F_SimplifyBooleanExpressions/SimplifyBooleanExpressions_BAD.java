package C807F_SimplifyBooleanExpressions;

public class SimplifyBooleanExpressions_BAD {
    public class Test {
        private boolean foo = (isBar() == true);

        public boolean isBar() {
            return false;
        }
    }
}
