//
//  C0019_CWE321_Hard_Coded_Cryptographic_Key.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/11.
//

import Foundation
import CommonCrypto

class C0019_CWE321_Hard_Coded_Cryptographic_Key{
    func bad_encryptMessage(plaintext: String) {
        let Key = "hardcoded_key"
        let iv = "hardcoded_iv"
        let msg = "hardcoded_msg"
        let ciphertext = NSMutableData(length: plaintext.lengthOfBytes(using: .utf8) + kCCBlockSizeAES128)!
        var numBytesEncrypted: size_t = 0
        
        let cStatus = CCCrypt(UInt32(kCCEncrypt),
                UInt32(kCCAlgorithmAES128),
                UInt32(kCCOptionPKCS7Padding),
                Key,
                16, // key size
                iv,
                msg,
                msg.count,
                ciphertext.mutableBytes,
                ciphertext.length,
                &numBytesEncrypted)

    }


    func encryptMessage(plaintext: String, key: Data, iv: Data) -> Data? {
        guard let data = plaintext.data(using: .utf8) else { return nil }
        let bufferSize = data.count + kCCBlockSizeAES128
        var buffer = [UInt8](repeating: 0, count: bufferSize)
        var numBytesEncrypted: size_t = 0
        
        let status = key.withUnsafeBytes { keyBytes in
            iv.withUnsafeBytes { ivBytes in
                data.withUnsafeBytes { dataBytes in
                    CCCrypt(UInt32(kCCEncrypt),
                            UInt32(kCCAlgorithmAES),
                            UInt32(kCCOptionPKCS7Padding),
                            keyBytes.baseAddress,
                            key.count,
                            ivBytes.baseAddress,
                            dataBytes.baseAddress,
                            data.count,
                            &buffer,
                            bufferSize,
                            &numBytesEncrypted)
                }
            }
        }
        
        if status == kCCSuccess {
            let encryptedData = Data(bytes: buffer, count: numBytesEncrypted)
            return encryptedData
        }
       
        return nil
    }
    
//    func good() {
//           let key = "random_key".data(using: .utf8)
//           let iv = "random_iv".data(using: .utf8)
//           let plaintext = "my secret message"
//           if let ciphertext = encryptMessage2(plaintext: plaintext, key: key, iv: iv){
//            print(ciphertext)
//           } else {
//               print("Encryption failed")
//           }
//
//    }
}
