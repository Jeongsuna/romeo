package C904C_IDENTICALIMPL;


public class IDENTICALIMPL_BAD {
  private final static String CODE = "bounteous";

  public String calculateCode() {
    // do Something;
    return CODE;
  }

  public String getName() {  // Noncompliant
    // do Something;
    return CODE;
  }
}