import Foundation

class C0016_CWE259_nsurlrequest_param_04 {
    func bad(url: URL) -> URLRequest {
        var request = URLRequest(url: url)
        let body = "id=codemind&password=7sk18zh"
        // Flaw
        request.httpBody = body.data(using: .utf8)
        return request
    }
}