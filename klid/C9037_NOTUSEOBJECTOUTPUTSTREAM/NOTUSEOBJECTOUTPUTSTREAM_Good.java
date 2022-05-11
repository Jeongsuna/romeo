package C9037_NOTUSEOBJECTOUTPUTSTREAM;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class NOTUSEOBJECTOUTPUTSTREAM_Good {

    public void method(String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream (fileName);
        ObjectOutputStream out = new ObjectOutputStream(fos);
    }
}
