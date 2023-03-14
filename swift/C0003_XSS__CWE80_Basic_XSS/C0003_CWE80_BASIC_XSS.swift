import Foundation
import UIKit
import WebKit

class C0003_CWE80_BASIC_XSS{
    func bad() {
        let inputField : UITextField?
        let wView = WKWebView()
        wView.loadHTMLString(inputField.text, baseURL: nil)
    }

    func good(with htmlStr: String) {
        let allowedCharacterSet = CharacterSet(charactersIn: "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789")
        let cleanedHTMLStr = htmlStr.components(separatedBy: allowedCharacterSet.inverted).joined(separator: "")

        let wView = WKWebView()
        wView.loadHTMLString(cleanedHTMLStr, baseURL: nil)
    }
}