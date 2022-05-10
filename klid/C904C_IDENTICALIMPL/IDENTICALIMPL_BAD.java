package C904C_IDENTICALIMPL;


public class IDENTICALIMPL_BAD {
  private final static String CODE = "bounteous";

  public String calculateCode() {
    doSomething();
    return CODE;
  }

  public String getName() {  // Noncompliant
    doSomething();
    return CODE;
  }
}