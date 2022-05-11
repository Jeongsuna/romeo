package C904F_STREAMRETURN;

import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;

public class STREAMRETURN_GOOD extends InputStream {

  byte[] buffer;
  int cnt;

  //....

  @Override
  public int read() throws IOException {
    if (cnt == buffer.length) {
      return -1;
    }
    return buffer[cnt++] & 0xFF; // The 0xFF bitmask is applied
  }
}