package C9043_OVERRIDESYNC;

public class Parent {

  synchronized void execute() {
    //...
  }
}

public class Child extends Parent {

  @Override
  public void execute() {  // Noncompliant
    // ...
    super.execute();
  }
}
