package C80C0_EmptyWhileStmt;

public class EmptyWhileStmt_GOOD {
    public class Test {
        void foo(int x, int y) {
            while (x == y) {
                x += y;
            }
        }
    }
}
