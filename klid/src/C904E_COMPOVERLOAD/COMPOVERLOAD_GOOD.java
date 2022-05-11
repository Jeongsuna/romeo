package C904E_COMPOVERLOAD;

public final class COMPOVERLOAD_GOOD {
  static class Book implements Comparable<Book> {
    public int compareTo(Book book) {
      return -1;
    }
  }

  static class FooBook extends Book {
    public int compareTo(Book book) {
      return 0;
    }
  }
}
