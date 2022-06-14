package C80BF_EmptyTryBlock;

public class EmptyTryBlock_BAD {
    public class Test {
        public void foo() {
            try
            {
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
