function f(myVariable) {
    switch (myVariable) {
      case 11:
      case 12:
        foo();
        break;
      case 13:  // Both 'doSomething()' and 'doSomethingElse()' will be executed. Is it on purpose ?
        doSomething();
      default:
        doSomethingElse();
        break;
    }
}
