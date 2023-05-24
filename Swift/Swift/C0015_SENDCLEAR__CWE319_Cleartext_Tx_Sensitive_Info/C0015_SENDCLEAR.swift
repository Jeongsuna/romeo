//
//  C0015_SENDCLEAR.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/15.
//

import Foundation
class C0015_SENDCLEAR__CWE319_Cleartext_Tx_Sensitive_Info{
    func bad(){
        let username = "myUsername"
        let password = "myPassword"

        let url = URL(string: "http://example.com/login.php?username=\(username)&password=\(password)")!
        let task = URLSession.shared.dataTask(
            with: url,
            completionHandler: { (data, response, error) in
                // Handle response from server
            }
        )

        task.resume()

    }

    func good(){
        let username = "myUsername"
        let password = "myPassword"

        var urlComponents = URLComponents()
        urlComponents.scheme = "https"
        urlComponents.host = "example.com"
        urlComponents.path = "/login.php"
        urlComponents.queryItems = [
            URLQueryItem(name: "username", value: username),
            URLQueryItem(name: "password", value: password)
        ]

        let request = URLRequest(url: urlComponents.url!)

        let task = URLSession.shared.dataTask(
            with: request,
            completionHandler: { (data, response, error) in
                // Handle response from server
            }
        )

        task.resume()

    }
}

