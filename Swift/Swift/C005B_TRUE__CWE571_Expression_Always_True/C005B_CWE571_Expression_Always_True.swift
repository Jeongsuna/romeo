//
//  C005B_CWE571_Expression_Always_True.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/16.
//

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
