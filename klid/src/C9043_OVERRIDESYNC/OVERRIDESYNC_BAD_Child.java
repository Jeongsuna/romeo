package C9043_OVERRIDESYNC;



public class OVERRIDESYNC_BAD_Child extends OVERRIDESYNC_BAD_Parent {

  @Override
  public void execute() {  // Noncompliant
    // ...
    super.execute();
  }
}
