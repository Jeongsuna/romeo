package C8042_IdenticalCatchBranches;

public class IdenticalCatchBranches_GOOD {
    public static class TestClass{
        public static void main(String[] args) {
            try {
            } catch (IllegalArgumentException | IllegalStateException e) {
                throw e;
            }
        }
    }
}
