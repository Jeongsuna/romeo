//
//  C0003_XSS_Reflected.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/10.
//

import Foundation
import WebKit
import UIKit

class C003_XSS_Reflected{
    func bad(app: UIApplication, openURL url: NSURL, options: [String : AnyObject]) -> String? {
        
        let name = getQueryStringParameter(url.absoluteString, "name")
        let html = "Hi \(name)"
        let webView = UIWebView()
        webView.loadHTMLString(html, baseURL:nil)
        
        return nil
    }
    func getQueryStringParameter(_ url: String?, _ param: String) -> String? {
        if let url = url, let urlComponents = URLComponents(string: url), let queryItems = urlComponents.queryItems {
            return queryItems.first(where: { $0.name == param })?.value
        }
        return nil
    }
    
    func good(app: UIApplication, openURL url: NSURL, options: [String : AnyObject]) -> String? {

        let name = getQueryStringParameter(url.absoluteString, "name")
        let html = "Hi \(name)"
        let htmlStr = sanitizedInput(html)
        let wView = WKWebView()
        wView.loadHTMLString(htmlStr, baseURL: nil)

        return nil
    }

    func sanitizedInput(_ input: String) -> String {
        let encodedOutput = input.replacingOccurrences(of: "&", with: "&amp;")
                                 .replacingOccurrences(of: "<", with: "&lt;")
                                 .replacingOccurrences(of: ">", with: "&gt;")
                                 .replacingOccurrences(of: "\"", with: "&quot;")
                                 .replacingOccurrences(of: "'", with: "&#x27;")
        return encodedOutput
    }
}
