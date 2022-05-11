package C903E_VOLATILEFIELD;

import java.util.concurrent.atomic.AtomicInteger;

public class VOLATILEFIELD_GOOD {
  private AtomicInteger count;
  private boolean boo = false;

  public void incrementCount() {
    count.incrementAndGet();
  }

  public synchronized void toggleBoo() {
    boo = !boo;
  }
}
