package swift.C001C_LEAKCOM

import Foundation

func bad_leakcom(id: String, pw: String) {
    // id: admin, password: adminpw
    login(id: id, pw: pw)
}