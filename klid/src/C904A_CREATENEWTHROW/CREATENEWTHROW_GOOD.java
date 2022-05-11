package C904A_CREATENEWTHROW;


public class CREATENEWTHROW_GOOD {
  public void foo() {
    //...
    Object obj = null;
    if (obj == null)
        throw new NullPointerException("obj must not be null");
  }
}