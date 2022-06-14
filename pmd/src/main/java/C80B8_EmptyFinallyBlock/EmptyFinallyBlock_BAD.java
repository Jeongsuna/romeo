package C80B8_EmptyFinallyBlock;

public class EmptyFinallyBlock_BAD {
    public class Test {
        public boolean foo() {
            try {
                int a = 3;
                return true;
            } finally {
            }
        }
    }
}
