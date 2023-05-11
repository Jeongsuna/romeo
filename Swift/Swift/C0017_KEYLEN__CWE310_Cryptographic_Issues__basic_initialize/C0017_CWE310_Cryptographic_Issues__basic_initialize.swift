//
//  C0017_CWE310_Cryptographic_Issues__basic_initialize.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/11.
//

import Foundation
import CommonCrypto

class C0017_CWE310_Cryptographic_Issues__basic_initialize {
//    func bad() {
//        let iv = getTrueRandomIV()
//        let Key = "mySecretKey".data(using: .utf8)!
//        let plaintext = "mySensitiveData".data(using: .utf8)!
//
//        let ciphertextSize = plaintext.count + kCCBlockSizeDES
//        var ciphertext = Data(count: ciphertextSize)
//
//        var numBytesEncrypted = 0
//        let Status = CCCrypt(
//                UInt32(kCCEncrypt),
//                UInt32(kCCAlgorithmDES),
//                UInt32(kCCOptionPKCS7Padding),
//                key,
//                UInt32(kCCKeySizeDES), // 64-bit key size
//                iv,
//                plaintext,
//                plaintextLength,
//                ciphertext,
//                ciphertextLength,
//                &numBytesEncrypte
//        )
//    }
//
//    func good() {
//        let iv = getTrueRandomIV()
//        let Key = "mySecretKey".data(using: .utf8)!
//        let plaintext = "mySensitiveData".data(using: .utf8)!
//
//        let ciphertextSize = plaintext.count + kCCBlockSizeDES
//        var ciphertext = Data(count: ciphertextSize)
//
//        var numBytesEncrypted = 0
//        let Status = CCCrypt(
//                UInt32(kCCEncrypt),
//                UInt32(kCCAlgorithmDES),
//                UInt32(kCCOptionPKCS7Padding),
//                Key.bytes, // key의 size가 64-bit
//                kCCKeySizeDES,
//                iv.bytes,
//                plaintext.bytes,
//                plaintext.count,
//                &ciphertext,
//                ciphertextSize,
//                &numBytesEncrypted
//        )
//    }
//    
//    func getTrueRandomIV() -> Data {
//        var randomBytes = [UInt8](repeating: 0, count: kCCBlockSizeDES)
//        let result = SecRandomCopyBytes(kSecRandomDefault, kCCBlockSizeDES, &randomBytes)
//        assert(result == 0, "Failed to get random bytes for IV")
//        return Data(bytes: randomBytes)
//    }
//
//    func encryptData(plaintext: Data, key: Data) -> Data? {
//        let iv = getTrueRandomIV()
//        let keySize = kCCKeySizeDES
//        let encryptedData = NSMutableData(length: Int(plaintext.count) + kCCBlockSizeDES)
//        var numBytesEncrypted: size_t = 0
//        
//        let cryptStatus = key.withUnsafeBytes { keyBytes in
//            iv.withUnsafeBytes { ivBytes in
//                plaintext.withUnsafeBytes { plainBytes in
//                    encryptedData?.mutableBytes.bindMemory(to: UInt8.self, capacity: encryptedData!.length).withUnsafeMutableBytes { encryptedBytes in
//                        CCCrypt(UInt32(kCCEncrypt),
//                                UInt32(kCCAlgorithmDES),
//                                UInt32(kCCOptionPKCS7Padding),
//                                keyBytes.baseAddress,
//                                keySize,
//                                ivBytes.baseAddress,
//                                plainBytes.baseAddress,
//                                plainBytes.count,
//                                encryptedBytes.baseAddress,
//                                encryptedBytes.count,
//                                &numBytesEncrypted)
//                    }
//                }
//            }
//        }
//        
//        if cryptStatus == kCCSuccess {
//            encryptedData?.length = Int(numBytesEncrypted)
//            return encryptedData as Data?
//        } else {
//            return nil
//        }
//    }
//
//    // Example usage
//    let plaintext = "Hello, world!".data(using: .utf8)!
//    let key = "SecretKey".data(using: .utf8)!
//    if let encryptedData = encryptData(plaintext: plaintext, key: key) {
//        print(encryptedData)
//    } else {
//        print("Encryption failed")
//    }
//        
}
