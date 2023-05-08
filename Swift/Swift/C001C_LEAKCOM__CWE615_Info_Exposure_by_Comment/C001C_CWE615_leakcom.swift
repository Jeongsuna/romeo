//
//  C001C_CWE615_leakcom.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/04.
//

import Foundation

class C001C_CWE615_leakcom{
    func bad(id: String, pw: String) {
        // id: admin, password: adminpw
        login(id: id, pw: pw)
    }
}
