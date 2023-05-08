//
//  C0017_CWE310_Cryptographic_Issues__basic_initialize.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/04.
//

import Foundation
import CommonCrypto

class C0017_CWE310_Cryptographic_Issues__basic_initialize {
    func bad() {
        let iv = getTrueRandomIV()
        let Key = "mySecretKey".data(using: .utf8)!
        let plaintext = "mySensitiveData".data(using: .utf8)!

        let ciphertextSize = plaintext.count + kCCBlockSizeDES
        var ciphertext = Data(count: ciphertextSize)

        var numBytesEncrypted = 0
        let Status = CCCrypt(
                UInt32(kCCEncrypt),
                UInt32(kCCAlgorithmDES),
                UInt32(kCCOptionPKCS7Padding),
                key,
                UInt32(kCCKeySizeDES), // 64-bit key size
                iv,
                plaintext,
                plaintextLength,
                ciphertext,
                ciphertextLength,
                &numBytesEncrypted
        )
    }

    func good() {
        let iv = getTrueRandomIV()
        let Key = "mySecretKey".data(using: .utf8)!
        let plaintext = "mySensitiveData".data(using: .utf8)!

        let ciphertextSize = plaintext.count + kCCBlockSizeDES
        var ciphertext = Data(count: ciphertextSize)

        var numBytesEncrypted = 0
        let Status = CCCrypt(
                UInt32(kCCEncrypt),
                UInt32(kCCAlgorithmDES),
                UInt32(kCCOptionPKCS7Padding),
                Key.bytes, // key의 size가 64-bit
                kCCKeySizeDES,
                iv.bytes,
                plaintext.bytes,
                plaintext.count,
                &ciphertext,
                ciphertextSize,
                &numBytesEncrypted
        )
    }
}
