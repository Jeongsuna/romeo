package C904F_STREAMRETURN;

public class STREAMRETURN_GOOD implements InputStream {

  //....

  @Override
  public int read() throws IOException {
    if (cnt == buffer.length()) {
      return -1;
    }
    return buffer.getByte(cnt++); // Noncompliant, a signed byte value is returned
  }
}
