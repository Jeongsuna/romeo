//
//  C0013_BROKNCRYPT__CWE327_hash_sha1_CryptoKit.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/16.
//

import Foundation
import CryptoKit
import CommonCrypto

class C0013_BROKNCRYPT__CWE327_hash_sha1_CryptoKit{
    func bad() {
        let bytes:Array<UInt8> = [0x01, 0x02, 0x03, 0x04, 0x05, 0x06]
        // Flaw
        var sha1 = Insecure.SHA1.init()
        sha1.update(data: bytes)
        let hashValue = sha1.finalize().hashValue
        print("Hash Value: \(hashValue)")
    }
}
