import Foundation
import CryptoKit
import CommonCrypto

class C0013_BROKNCRYPT__CWE327_hash_md5_CommonCrypto{
    func bad(data: UnsafeRawPointer!,len: CC_LONG) {
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
}