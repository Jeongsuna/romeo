//
//  0001_SQLI.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/04.
//
import Foundation
import SQLite3
class C0001_CWE89_SQL_Injection {
    func bad() {
        let userid = "id"
        let username = "name"
        
        let db: OpaquePointer? = nil
        let sql = "SELECT * FROM items WHERE userid='\(userid)' AND username='\(username)'"
        var stmt: OpaquePointer? = nil
        
        if sqlite3_prepare_v2(db, sql, -1, &stmt, nil) == SQLITE_OK {
            if sqlite3_step(stmt) == SQLITE_ROW {
            //...
            }
        }
    }

    func good() {
        func getFromUser(param: String) -> String{
            let userInfo: String = param
            return userInfo
        }
        
        let userid = getFromUser(param:"id")
        let username = getFromUser(param:"name")

        let db: OpaquePointer? = nil
        let sql = "SELECT * FROM items WHERE userid=? AND username=?"
        var stmt: OpaquePointer? = nil
        let SQLITE_TRANSIENT = unsafeBitCast(-1, to: sqlite3_destructor_type.self)

        if sqlite3_prepare_v2(db, sql, -1, &stmt, nil) == SQLITE_OK {
            sqlite3_bind_text(stmt, 1, userid, -1, SQLITE_TRANSIENT)
            sqlite3_bind_text(stmt, 2, username, -1, SQLITE_TRANSIENT)

            if sqlite3_step(stmt) == SQLITE_ROW {
                // ...
            }
        }
    }
}

