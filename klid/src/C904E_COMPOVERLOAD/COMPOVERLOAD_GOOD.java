package C904E_COMPOVERLOAD;

public class Foo {
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
