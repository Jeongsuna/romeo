//
//  C0016_CWE259_urlrequest_header_01.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/04.
//

import Foundation

class C0016_CWE259_urlrequest_header_01 {
    func bad(url: URL) -> URLRequest {
        var request = URLRequest(url: url)
        let password = "6sk18zh"
        // Flaw
        request.setValue(password, forHTTPHeaderField: "password")
        return request
    }
}
