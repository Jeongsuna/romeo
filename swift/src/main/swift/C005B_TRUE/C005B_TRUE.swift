package swift.C005B_TRUE
if true {  // Noncompliant
  doSomething()
}

func doSomething() {
  print("do doSomething")
}