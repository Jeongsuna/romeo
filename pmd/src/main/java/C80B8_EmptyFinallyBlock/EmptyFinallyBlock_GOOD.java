package C80B8_EmptyFinallyBlock;

public class EmptyFinallyBlock_GOOD {
    public class Test {
        public boolean foo() {
            try {
                int a = 3;
            } finally {
                return true;
            }
        }
    }
}
