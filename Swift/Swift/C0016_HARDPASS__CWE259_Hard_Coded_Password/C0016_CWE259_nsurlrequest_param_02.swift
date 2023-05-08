//
//  C0016_CWE259_nsurlrequest_param_02.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/04.
//

import Foundation

class C0016_CWE259_nsurlrequest_param_02 {
    func bad(url: URL) -> URLRequest {
        var request = URLRequest(url: url)
        // Flaw
        request.httpBody = "password=6sk18zh".data(using: .utf8)
        return request
    }
}
