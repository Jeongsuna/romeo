package C904D_ITERRETURN;

class ITERRETURN_BAD implements Iterator<Item>, Iterable<Item> {
  private Item[] items;
  private int idx = 0;

  public boolean hasNext() {
    return idx < items.length;
  }

  public Itemnext() {
    return items[idx++];
  }

  public Iterator<Item> iterator() {
    return this; // Noncompliant
  }
  // ...
}