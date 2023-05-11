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
    
    func good(with htmlStr: String) {
        let allowedCharacterSet = CharacterSet(charactersIn: "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789")
        let cleanedHTMLStr = htmlStr.components(separatedBy: allowedCharacterSet.inverted).joined(separator: "")

        let wView = WKWebView()
        wView.loadHTMLString(cleanedHTMLStr, baseURL: nil)
    }
}
