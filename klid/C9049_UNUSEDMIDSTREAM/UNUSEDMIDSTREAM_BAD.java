package C9049_UNUSEDMIDSTREAM;

public class UNUSEDMIDSTREAM_BAD {


  public static void main(String[] args) {
    widgets.stream().filter(w -> w.getColor() == BLUE); // Noncompliant
  }

}