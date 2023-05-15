//
//  C0014_CWE312_Cleartext_Storage_of_Sensitive_Information.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/10.
//

import Foundation
import CryptoSwift

class C0014_CWE312_Cleartext_Storage_of_Sensitive_Information {
    func bad() {
        let userId = "userid"
        let userPwd = "userpassword"

        // 파일 저장
        let fileURL = FileManager.default.urls(for: .documentDirectory, in: .userDomainMask).first?.appendingPathComponent("credentials.txt")
        try! "\(userId),\(userPwd)".write(to: fileURL!, atomically: true, encoding: .utf8)

        // 파일 읽기
        let credentials = try! String(contentsOf: fileURL!, encoding: .utf8)
        print(credentials)
    }
//
//    func good() {
//        let userId = "userid"
//        let userPwd = "userpassword"
//        // 데이터 암호화
//        let plainText = userId.data(using: .utf8)!
//        let cipherText = try! plainText.encrypt(.aes, key: userPwd.data(using: .utf8)!)
//        // 파일 저장
//        let fileURL = FileManager.default.urls(for: .documentDirectory, in: .userDomainMask).first?.appendingPathComponent("credentials.bin")
//        try! cipherText.write(to: fileURL!)
//        // 데이터 복호화
//        let decryptedData = try! Data(contentsOf: fileURL!).aesDecrypt(key: userPwd)
//        let credentials = String(data: decryptedData, encoding: .utf8)!
//        print(credentials)
//    }
}
