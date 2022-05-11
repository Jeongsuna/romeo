package C903E_VOLATILEFIELD;

public class VOLATILEFIELD_GOOD {
  private AtomicInteger count = 0;
  private boolean boo = false;

  public void incrementCount() {
    count.incrementAndGet();
  }

  public synchronized void toggleBoo() {
    boo = !boo;
  }
}
