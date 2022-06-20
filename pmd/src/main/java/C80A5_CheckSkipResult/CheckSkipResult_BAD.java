package C80A5_CheckSkipResult;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckSkipResult_BAD {
    public class Foo {
        private FileInputStream _s = new FileInputStream("file");
        public void skip(int n) throws IOException {
            _s.skip(n);
        }
        public Foo() throws FileNotFoundException {
        }
    }
}
