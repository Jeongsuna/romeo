//
//  C001B_CWE359_cookie_expires_new.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/16.
//

import Foundation

class C001B_CWE359_cookie_expires_new {
    func bad() -> HTTPCookie {
        let properties = [
            HTTPCookiePropertyKey.domain: "www.test.com",
            HTTPCookiePropertyKey.path: "/start",
            // Flaw
            HTTPCookiePropertyKey.expires : NSDate(timeIntervalSinceNow: (60*60*24*30*12)),
            HTTPCookiePropertyKey.secure: true
        ] as [HTTPCookiePropertyKey : Any]
        let cookie = HTTPCookie(properties: properties)
        return cookie!
    }

    func good() -> HTTPCookie {
        let properties = [
            HTTPCookiePropertyKey.domain: "www.test.com",
            HTTPCookiePropertyKey.path: "/start",
            //
            HTTPCookiePropertyKey.expires : NSDate(timeIntervalSinceNow: (60*60*24)),
            HTTPCookiePropertyKey.secure: true
        ] as [HTTPCookiePropertyKey : Any]
        let cookie = HTTPCookie(properties: properties)
        return cookie!
    }
}
