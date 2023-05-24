//
//  C0016_CWE259_nsurlrequest_param_03.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/11.
//

import Foundation
class C0016_CWE259_nsurlrequest_param_03 {
    func bad(url: URL) -> URLRequest {
        var request = URLRequest(url: url)
        let body = "id=codemind&password=7sk18zh".data(using: .utf8)
        // Flaw
        request.httpBody = body
        return request
    }
}
