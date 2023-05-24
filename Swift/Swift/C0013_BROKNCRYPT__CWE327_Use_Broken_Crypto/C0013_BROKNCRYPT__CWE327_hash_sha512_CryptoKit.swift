//
//  C0013_BROKNCRYPT__CWE327_hash_sha512_CryptoKit.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/16.
//

import Foundation
import CryptoKit
import CommonCrypto

class C0013_BROKNCRYPT__CWE327_hash_sha512_CryptoKit{
    func good() {
        let bytes:Array<UInt8> = [0x01, 0x02, 0x03, 0x04, 0x05, 0x06]
        var sha512 = SHA512.init()
        sha512.update(data: bytes)
        let hashValue = sha512.finalize().hashValue
        print("Hash Value: \(hashValue)")
    }
}
