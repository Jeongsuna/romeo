package C80A5_CheckSkipResult;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckSkipResult_GOOD {
    public class Foo {
        private FileInputStream _s = new FileInputStream("file");
        public void skipExactly(int n) throws IOException {
            while (n != 0) {
                long skipped = _s.skip(n);
                if (skipped == 0)
                    throw new EOFException();
                n -= skipped;
            }
        }
        public Foo() throws FileNotFoundException {
        }
    }
}
