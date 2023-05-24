//
//  C0013_BROKNCRYPT__CWE327_crypt_des_CommonCrypto.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/16.
//

import Foundation
import CryptoKit
import CommonCrypto

class C0013_BROKNCRYPT__CWE327_crypt_des_CommonCrypto{
    func bad(key: UnsafeRawPointer!, keyLength: Int, iv: UnsafeRawPointer!, dataIn: UnsafeRawPointer!,  dataInLength: Int, dataOut: UnsafeMutableRawPointer!, dataOutAvailable: Int, dataOutMoved: UnsafeMutablePointer<Int>!) -> UnsafeMutableRawPointer! {

        let cStatus = CCCrypt(UInt32(kCCEncrypt),
                UInt32(kCCAlgorithmDES),    // Flaw
                UInt32(kCCOptionPKCS7Padding),
                key,
                keyLength,
                iv,
                dataIn,
                dataInLength,
                dataOut,
                dataOutAvailable,
                dataOutMoved)

        return dataOut
    }
}
