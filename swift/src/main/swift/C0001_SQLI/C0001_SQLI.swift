package swift.C0001_SQLI

import Foundation

func bad_sqli() {
    let sql = "SELECT * FROM items WHERE userid='\(id)' AND username='\(name)'"
    var stmt: OpaquePointer? = nil
    if sqlite3_prepare_v2(db, sql, -1, &stmt, nil) == SQLITE_OK {
        if sqlite3_step(stmt) == SQLITE_ROW {
        //...
        }
    }
}

func good_sqli() {
    let userid = getFromUser("id")
    let username = getFromUser("name")

    let sql = "SELECT * FROM items WHERE userid=? AND username=?"
    var stmt: OpaquePointer? = nil

    if sqlite3_prepare_v2(db, sql, -1, &stmt, nil) == SQLITE_OK {
        sqlite3_bind_text(stmt, 1, userid, -1, SQLITE_TRANSIENT)
        sqlite3_bind_text(stmt, 2, username, -1, SQLITE_TRANSIENT)

        if sqlite3_step(stmt) == SQLITE_ROW {
            // ...
        }
    }
}