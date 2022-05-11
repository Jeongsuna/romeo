package C904F_STREAMRETURN;

import java.io.IOException;
import java.io.InputStream;

public class STREAMRETURN_BAD extends InputStream {

  byte[] buffer;
  int cnt;
  //....

  @Override
  public int read() throws IOException {
    if (buffer.length == cnt) {
      return -1;
    }
    return buffer[cnt++]; // Noncompliant, a signed byte value is returned
  }
}
