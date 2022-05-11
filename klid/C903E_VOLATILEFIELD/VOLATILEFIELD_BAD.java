package C903E_VOLATILEFIELD;

public class VOLATILEFIELD_BAD {
  private volatile int count = 0;
  private volatile boolean boo = false;

  public void incrementCount() {
    count++;  // Noncompliant
  }

  public void toggleBoo(){
    boo = !boo;  // Noncompliant
  }
}
