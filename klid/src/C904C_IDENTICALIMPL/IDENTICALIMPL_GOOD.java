package C904C_IDENTICALIMPL;


public class IDENTICALIMPL_GOOD {
  private final static String CODE = "bounteous";

  public String getCode() {
    // do Something;
    return CODE;
  }

  public String getName() {
    return getCode();
  }
}
