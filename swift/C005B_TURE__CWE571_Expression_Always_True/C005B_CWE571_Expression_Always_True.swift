import Foundation

class C005B_CWE571_Expression_Always_True {
  func bad(){
    if true {  // Noncompliant
      doSomething()
    }

    func doSomething() {
      print("do doSomething")
    }
  }
}