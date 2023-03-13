package swift.C0019_HARDKEY

import Foundation

func bad_encryptMessage() {
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
                          msg.length,
                          ciphertext.mutableBytes,
                          ciphertext.length,
                          &numBytesEncrypted)

}

func good_encryptMessage(message: String) -> Data? {
    let key = Data.randomBytes(length: kCCKeySizeAES128)
    let iv = AES256.randomIV()
    guard let encryptedData = message.data(using: .utf8)?.encrypt(withKey: key, iv: iv) else {
        return nil
    }
    let encryptedMessage = iv + encryptedData
    return encryptedMessage
}

