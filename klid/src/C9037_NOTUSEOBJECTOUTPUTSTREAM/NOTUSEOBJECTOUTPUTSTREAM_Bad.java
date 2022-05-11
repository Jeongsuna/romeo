package C9037_NOTUSEOBJECTOUTPUTSTREAM;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class NOTUSEOBJECTOUTPUTSTREAM_Bad {

    public void method(String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream (fileName , true);  // fos opened in append mode
        ObjectOutputStream out = new ObjectOutputStream(fos);  // Noncompliant
    }
}
