package swift.C001B_PERSCOOKIE.swift

import SQLite3

func bad() {
  var n: Int = 3
  // Flaw
  sqlite3_randomness(10, &n)
}

func good() {
  let randomInt = Int.random(in: 1..<5)
}
