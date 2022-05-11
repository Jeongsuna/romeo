package C904A_CREATENEWTHROW;

public class CREATENEWTHROW_BAD {
  public static final void main(String[] argv) {
    //...

    Object obj = null;
    if (obj == null)
      new NullPointerException("obj must not be null");
  }
}