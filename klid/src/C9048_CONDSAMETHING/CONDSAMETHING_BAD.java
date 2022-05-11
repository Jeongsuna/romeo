package C9048_CONDSAMETHING;

public class CONDSAMETHING_BAD {
  public static final void main(String[] args) {
    if (y == 0) {  // Noncompliant
      doOneMoreThing();
    } else {
      doOneMoreThing();
    }

    int y = x > 12 ? 4 : 4;  // Noncompliant

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
}