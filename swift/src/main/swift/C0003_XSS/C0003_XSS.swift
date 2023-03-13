package swift.C0003_XSS

import Foundation

func bad_application() {
    let inputField : UITextField
    let wView : WKWebView
    wView.loadHTMLString(inputField.text, baseURL:nil)
}

func good_application(with htmlStr: String) {
    let allowedCharacterSet = CharacterSet(charactersIn: "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789")
    let cleanedHTMLStr = htmlStr.components(separatedBy: allowedCharacterSet.inverted).joined(separator: "")

    let wView = WKWebView()
    wView.loadHTMLString(cleanedHTMLStr, baseURL: nil)
}
