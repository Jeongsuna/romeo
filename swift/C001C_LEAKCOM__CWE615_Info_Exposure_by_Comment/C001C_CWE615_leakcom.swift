import Foundation

class C001C_CWE615_leakcom{
    func bad(id: String, pw: String) {
        // id: admin, password: adminpw
        login(id: id, pw: pw)
    }
}
