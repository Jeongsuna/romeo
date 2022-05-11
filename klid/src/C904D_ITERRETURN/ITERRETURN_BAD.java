package C904D_ITERRETURN;

import java.util.Iterator;

class ITERRETURN_BAD implements Iterator<String>, Iterable<String> {
  private String[] items;
  private int idx = 0;

  public boolean hasNext() {
    return idx < items.length;
  }

  @Override
  public String next() {
    return null;
  }

  public String Itemnext() {
    return items[idx++];
  }

  public Iterator<String> iterator() {
    return this; // Noncompliant
  }
  // ...
}