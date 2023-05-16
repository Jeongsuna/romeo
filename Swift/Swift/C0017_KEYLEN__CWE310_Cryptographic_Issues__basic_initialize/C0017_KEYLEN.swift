//
//  C0017_KEYLEN.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/16.
//

import Foundation
import Security

class C0017_KEYLEN{
    func bad() {
        let privateKeyFile = "private.key"
        let publicKeyFile = "public.key"
        let privateKeyURL = FileManager.default.urls(for: .documentDirectory, in: .userDomainMask).first!.appendingPathComponent(privateKeyFile)
        let publicKeyURL = FileManager.default.urls(for: .documentDirectory, in: .userDomainMask).first!.appendingPathComponent(publicKeyFile)
        let attributes: [CFString: Any] = [
            kSecAttrKeyType: kSecAttrKeyTypeRSA,
            kSecAttrKeySizeInBits: 1024
        ]
        guard let privateKey = SecKeyCreateRandomKey(attributes as CFDictionary, nil),
              let privateKeyData = SecKeyCopyExternalRepresentation(privateKey, nil) as Data?,
              let publicKey = SecKeyCopyPublicKey(privateKey),
              let publicKeyData = SecKeyCopyExternalRepresentation(publicKey, nil) as Data?
        else {
            print("Failed to generate or extract keys")
            return
        }
        try? privateKeyData.write(to: privateKeyURL)
        try? publicKeyData.write(to: publicKeyURL)
        print("Key pair generated successfully")
    }
    
    func good() {
        let privateKeyFile = "private.key"
        let publicKeyFile = "public.key"
        let privateKeyURL = FileManager.default.urls(for: .documentDirectory, in: .userDomainMask).first!.appendingPathComponent(privateKeyFile)
        let publicKeyURL = FileManager.default.urls(for: .documentDirectory, in: .userDomainMask).first!.appendingPathComponent(publicKeyFile)
        let attributes: [CFString: Any] = [
            kSecAttrKeyType: kSecAttrKeyTypeRSA,
            kSecAttrKeySizeInBits: 2048
        ]
        guard let privateKey = SecKeyCreateRandomKey(attributes as CFDictionary, nil),
              let privateKeyData = SecKeyCopyExternalRepresentation(privateKey, nil) as Data?,
              let publicKey = SecKeyCopyPublicKey(privateKey),
              let publicKeyData = SecKeyCopyExternalRepresentation(publicKey, nil) as Data?
        else {
            print("Failed to generate or extract keys")
            return
        }
        try? privateKeyData.write(to: privateKeyURL)
        try? publicKeyData.write(to: publicKeyURL)
        print("Key pair generated successfully")
    }
}
