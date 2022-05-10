package C904D_ITERRETURN;

class ITERRETURN_GOOD implements Iterable<Item> {
  private Item[] items;

  public Iterator<Item> iterator() {
    return new Iterator<Item>() {
      private int index = 0;

      public boolean hasNext() {
        return index < items.length;
      }

      public Foo next() {
        return items[index++];
      }
    };
  }
  // ...
}