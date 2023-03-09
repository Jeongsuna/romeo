package swift.C0016_HARDPASS

import Foundation

func bad_urlrequest_header1(url: URL) -> URLRequest {
    var request = URLRequest(url: url)
    let password = "6sk18zh"
    // Flaw
    request.setValue(password, forHTTPHeaderField: "password")
    return request
}

func bad_urlrequest_header2(url: URL) -> URLRequest {
    var request = URLRequest(url: url)
    // Flaw
    request.setValue("6sk18zh", forHTTPHeaderField: "password")
    return request
}

func bad_nsurlrequest_param(url: URL) -> NSURLRequest {
    let request = NSURLRequest(url: url)
    let password = "6sk18zh"
    // Flaw
    request.setValue(password, forKey: "password")
    return request
}

func bad_urlrequest_param1(url: URL) -> URLRequest {
    var request = URLRequest(url: url)
    // Flaw
    request.httpBody = "password=6sk18zh".data(using: .utf8)
    return request
}

func bad_urlrequest_param2(url: URL) -> URLRequest {
    var request = URLRequest(url: url)
	let body = "id=codemind&password=7sk18zh".data(using: .utf8)
	// Flaw
    request.httpBody = body
    return request
}

func bad_urlrequest_param3(url: URL) -> URLRequest {
    var request = URLRequest(url: url)
	let body = "id=codemind&password=7sk18zh"
	// Flaw
    request.httpBody = body.data(using: .utf8)
    return request
}