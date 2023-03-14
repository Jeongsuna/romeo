import Foundation

class C0016_CWE259_nsurlrequest_param_01 {
    func bad(url: URL) -> NSURLRequest {
        let request = NSURLRequest(url: url)
        let password = "6sk18zh"
        // Flaw
        request.setValue(password, forKey: "password")
        return request
    }
}