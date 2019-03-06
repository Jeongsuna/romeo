function doSomething() {
    var i = 0;
    return i +1;
}

function f(c) {
    a = true;
    b = false;
    if (b) { // Noncompliant
      doSomething();
    }

    if (c && !a) { // Noncompliant; "a" is always "true"
      doSomething();
    }

    if (c && b) { // Noncompliant; "!a" is always "false"
      doSomething();
    }
}