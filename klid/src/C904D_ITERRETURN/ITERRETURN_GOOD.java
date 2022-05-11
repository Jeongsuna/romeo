package C904D_ITERRETURN;

import java.util.Iterator;

class ITERRETURN_GOOD implements Iterable<String> {
  private String[] items;

  public Iterator<String> iterator() {
    return new Iterator<String>() {
      private int index = 0;

      public boolean hasNext() {
        return index < items.length;
      }

      public String next() {
        return items[index++];
      }
    };
  }
  // ...
}