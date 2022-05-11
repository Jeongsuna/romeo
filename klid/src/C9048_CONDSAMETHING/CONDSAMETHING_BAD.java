package C9048_CONDSAMETHING;

public class CONDSAMETHING_BAD {

  // ...

  public void foo(int x, int y, int i) {
    if (y == 0) {  // Noncompliant
      doOneMoreThing();
    } else {
      doOneMoreThing();
    }

    int z = x > 12 ? 4 : 4;  // Noncompliant

    switch (i) {  // Noncompliant
      case 1:
        doSomething();
        break;
      case 2:
        doSomething();
        break;
      case 3:
        doSomething();
        break;
      default:
        doSomething();
    }
  }

  private void doOneMoreThing() {}
  private void doSomething() {}
}