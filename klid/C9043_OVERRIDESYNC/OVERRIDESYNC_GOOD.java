package C9043_OVERRIDESYNC;

public class Parent {

  synchronized void execute() {
    //...
  }
}

public class Child extends Parent {

  @Override
  synchronized public void execute() {
    // ...
    super.execute();
  }
}
