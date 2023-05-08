//
//  C0003_XSS_Reflected.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/08.
//

import Foundation
import WebKit
import UIKit

func application(app: UIApplication, openURL url: NSURL, options: [String : AnyObject]) -> Bool {
    
    let name = getQueryStringParameter(url.absoluteString, "name")
    let html = "Hi \(name)"
    let webView = UIWebView()
    webView.loadHTMLString(html, baseURL:nil)
    
}

func getQueryStringParameter(_ url: String?, _ param: String) -> String? {
    if let url = url, let urlComponents = URLComponents(string: url), let queryItems = urlComponents.queryItems {
        return queryItems.first(where: { $0.name == param })?.value
    }
    return nil
}
