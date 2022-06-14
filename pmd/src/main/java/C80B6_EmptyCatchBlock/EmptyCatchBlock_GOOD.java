package C80B6_EmptyCatchBlock;

import java.io.FileInputStream;
import java.io.IOException;

public class EmptyCatchBlock_GOOD {
    public void Foo() {
        try
        {
            FileInputStream fileis = new FileInputStream("/tmp/src");
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
