package C904F_STREAMRETURN;

public class STREAMRETURN_GOOD implements InputStream {

  //....

  @Override
  public int read() throws IOException {
    if (cnt == buffer.length()) {
      return -1;
    }
    return buffer.getByte(cnt++) & 0xFF; // The 0xFF bitmask is applied
  }
}