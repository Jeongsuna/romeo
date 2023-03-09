package swift.C0013_BROKNCRYPT

import Foundation
import CryptoKit
import CommonCrypto

func bad_hash_md5_CryptoKit() {
    let bytes:Array<UInt8> = [0x01, 0x02, 0x03, 0x04, 0x05, 0x06]
    // Flaw
    var md5 = Insecure.MD5.init()
    md5.update(data: bytes)
    let hashValue = md5.finalize().hashValue
    print("Hash Value: \(hashValue)")
}

func bad_hash_sha1_CryptoKit() {
    let bytes:Array<UInt8> = [0x01, 0x02, 0x03, 0x04, 0x05, 0x06]
    // Flaw
    var sha1 = Insecure.SHA1.init()
    sha1.update(data: bytes)
    let hashValue = sha1.finalize().hashValue
    print("Hash Value: \(hashValue)")
}

func good_hash_sha512_CryptoKit() {
    let bytes:Array<UInt8> = [0x01, 0x02, 0x03, 0x04, 0x05, 0x06]
    var sha512 = SHA512.init()
    sha512.update(data: bytes)
    let hashValue = sha512.finalize().hashValue
    print("Hash Value: \(hashValue)")
}

func bad_hash_md5_CommonCrypto(data: UnsafeRawPointer!,len: CC_LONG) {
    let result = UnsafeMutablePointer<UInt8>.allocate(capacity: 8)
    // Flaw
    CC_MD5(data, 8, result)
    let hash = NSMutableString()
    for i in 0..<8 {
        hash.appendFormat("%02x", result[i])
    }
    result.deallocate()

    print("Hash Value: \(hash)")
}

func good_hash_sha512_CommonCrypto(data: UnsafeRawPointer!,len: CC_LONG) {
    let result = UnsafeMutablePointer<UInt8>.allocate(capacity: 8)
    CC_SHA512(data, 8, result)
    let hash = NSMutableString()
    for i in 0..<8 {
        hash.appendFormat("%02x", result[i])
    }
    result.deallocate()

    print("Hash Value: \(hash)")
}

func bad_crypt_des_CommonCrypto(key: UnsafeRawPointer!, keyLength: Int, iv: UnsafeRawPointer!, dataIn: UnsafeRawPointer!,  dataInLength: Int, dataOut: UnsafeMutableRawPointer!, dataOutAvailable: Int, dataOutMoved: UnsafeMutablePointer<Int>!) -> UnsafeMutableRawPointer! {

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