//
//  C001C_CWE615_leakcom.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/10.
//

import Foundation

class C001C_CWE615_leakcom{
    func bad(id: String, pw: String) {
        // id: admin, password: adminpw
        let adminId = id
        let adminPw = pw

        print("아이디 : " + adminId + ", 비밀번호 : " + adminPw)
    }
    
    func good(id: String, pw: String) {
        let adminId = id
        let adminPw = pw

        print("아이디 : " + adminId + ", 비밀번호 : " + adminPw)
    }
}

