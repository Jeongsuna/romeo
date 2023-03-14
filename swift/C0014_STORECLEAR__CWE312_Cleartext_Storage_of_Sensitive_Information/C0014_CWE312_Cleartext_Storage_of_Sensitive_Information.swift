import Foundation

class C0014_CWE312_Cleartext_Storage_of_Sensitive_Information {
    func bad() {
        let userId = "userid"
        let userPwd = "userpassword"

        // 파일 저장
        let fileURL = FileManager.default.urls(for: .documentDirectory, in: .userDomainMask).first?.appendingPathComponent("credentials.txt")
        try! "\(userId),\(userPwd)".write(to: fileURL!, atomically: true, encoding: .utf8)

        // 파일 읽기
        let credentials = try! String(contentsOf: fileURL!, encoding: .utf8)
        print(credentials)
    }

    func good() {
        let userId = "userid"
        let userPwd = "userpassword"

        // 데이터 암호화
        let ciphertext = try! userId.encryptAES256(userPwd: userPwd)

        // 파일 저장
        let fileURL = FileManager.default.urls(for: .documentDirectory, in: .userDomainMask).first?.appendingPathComponent("credentials.bin")
        try! ciphertext.write(to: fileURL!)

        // 데이터 복호화
        let decryptedData = try! Data(contentsOf: fileURL!).decryptAES256(userPwd: userPwd)
        let credentials = String(data: decryptedData, encoding: .utf8)!
        print(credentials)
    }
}