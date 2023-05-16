//
//  C0015_SENDCLEAR_02.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/16.
//

import Foundation

class C0015_SENDCLEAR_02{
    func bad(){
        let username = "myUsername"
        let password = "myPassword"

        let url = URL(string: "http://example.com/login.php?username=\(username)&password=\(password)")! //
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
