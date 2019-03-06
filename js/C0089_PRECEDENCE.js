function f(myObj, myClass) {
    if (!"prop" in myObj) {  // Noncompliant;  ""in"" operator is checking property ""false""
      doTheThing();  // this block will be never executed
    }

    if (!foo instanceof MyClass) {  // Noncompliant; ""!foo"" returns a boolean, which is not an instance of anything
      doTheOtherThing();  // this block is never executed
    }
}