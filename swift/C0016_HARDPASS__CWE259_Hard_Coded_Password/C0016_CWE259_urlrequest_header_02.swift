import Foundation

class C0016_CWE259_urlrequest_header_02 {
    func bad(url: URL) -> URLRequest {
        var request = URLRequest(url: url)
        // Flaw
        request.setValue("6sk18zh", forHTTPHeaderField: "password")
        return request
    }
}