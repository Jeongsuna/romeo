import Foundation
import CryptoKit
import CommonCrypto

class C0013_BROKNCRYPT__CWE327_hash_md5_CryptoKit{
    func bad() {
        let bytes:Array<UInt8> = [0x01, 0x02, 0x03, 0x04, 0x05, 0x06]
        // Flaw
        var md5 = Insecure.MD5.init()
        md5.update(data: bytes)
        let hashValue = md5.finalize().hashValue
        print("Hash Value: \(hashValue)")
    }
}





