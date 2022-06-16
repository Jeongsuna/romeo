package C8042_IdenticalCatchBranches;

public class IdenticalCatchBranches_BAD {
    public static class TestClass{
        public static void main(String[] args) {
            try {
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }
}
