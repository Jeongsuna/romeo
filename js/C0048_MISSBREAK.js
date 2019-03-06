function f(myVariable) {
    switch (myVariable) {
      case 1:
      case 2:
        foo();
        break;
      case 3:  // Both 'doSomething()' and 'doSomethingElse()' will be executed. Is it on purpose ?
        doSomething();
      default:
        doSomethingElse();
        break;
    }
}
