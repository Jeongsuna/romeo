package C904E_COMPOVERLOAD;

public final class COMPOVERLOAD_BAD {
  static class Book implements Comparable<Book> {
    public int compareTo(Book book) {
      return -1;
    }
  }

  static class FooBook extends Book {
    public int compareTo(FooBook book) {  // Noncompliant: Parameter should be of type Book
      return 0;
    }
  }
}