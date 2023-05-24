//
//  C0014_STORECLEAR.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/12.
//

import Foundation
import Security

func bad(_ password: String) {
    let filePath = "/path/to/password/file"
    do {
        try password.write(toFile: filePath, atomically: true, encoding: .utf8)
        print("Password saved successfully")
    } catch {
        print("Error saving password: \(error.localizedDescription)")
    }
}

func good(_ password: String) {
    let serviceName = "com.example.app.password"
    let accountName = "user"
    let passwordData = Data(password.utf8)
    let query: [String: Any] = [
        kSecClass as String: kSecClassGenericPassword,
        kSecAttrService as String: serviceName,
        kSecAttrAccount as String: accountName,
        kSecValueData as String: passwordData
    ]
    let status = SecItemAdd(query as CFDictionary, nil)
    guard status == errSecSuccess else {
        print("Error saving password: \(status)")
        return
    }
    print("Password saved successfully")
}
