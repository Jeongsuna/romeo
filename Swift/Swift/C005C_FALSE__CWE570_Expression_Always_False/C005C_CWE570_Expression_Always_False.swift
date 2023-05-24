//
//  C005C_CWE570_Expression_Always_False.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/16.
//

import Foundation

class C005C_CWE570_Expression_Always_False {
  func bad(){
    if false {  // Noncompliant
      doSomething()
    }

    func doSomething() {
      print("do doSomething")
    }
  }
}
