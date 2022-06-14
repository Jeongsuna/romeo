package C80BF_EmptyTryBlock;

import java.io.FileInputStream;

public class EmptyTryBlock_GOOD {
    public class Test {
        public void foo() {
            try
            {
                FileInputStream fileis = new FileInputStream("/tmp/src");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
