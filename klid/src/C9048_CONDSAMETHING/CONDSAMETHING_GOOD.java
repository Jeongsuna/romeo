package C9048_CONDSAMETHING;

public class CONDSAMETHING_GOOD {

  // ...

  public void foo(int b) {
    if(b == 0) {    //no issue, this could have been done on purpose to make the code more readable
      doSomething();
    } else if(b == 1) {
      doOneMoreThing();
    }
  }

  private void doOneMoreThing() {}
  private void doSomething() {}
}