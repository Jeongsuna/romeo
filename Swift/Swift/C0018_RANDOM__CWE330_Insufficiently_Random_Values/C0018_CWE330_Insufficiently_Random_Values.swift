//
//  C0018_CWE330_Insufficiently_Random_Values.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/04.
//

import SQLite3

class C0018_CWE330_Insufficiently_Random_Values{
  func bad() {
    var n: Int = 3
    // Flaw
    sqlite3_randomness(10, &n)
  }

  func good() {
    let randomInt = Int.random(in: 1..<5)
  }
}
