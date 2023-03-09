package swift.C001B_PERSCOOKIE

import Foundation

func bad_cookie_expires_old() -> NSHTTPCookie {
    let properties = [
        NSHTTPCookieDomain: "www.test.com",
        NSHTTPCookiePath: "/start",
        // Flaw
        NSHTTPCookieExpires : NSDate(timeIntervalSinceNow: (60*60*24*30*12)),
        NSHTTPCookieSecure: true
        ]
    return NSHTTPCookie(properties: properties)
}

func good_cookie_expires_old() -> HTTPCookie {
    let properties = [
        NSHTTPCookieDomain: "www.test.com",
        NSHTTPCookiePath: "/start",
        //
        NSHTTPCookieExpires : NSDate(timeIntervalSinceNow: (60*60*24)),
        NSHTTPCookieSecure: true
        ]
    return NSHTTPCookie(properties: properties)
}

func bad_cookie_expires_new() -> HTTPCookie {
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

func good_cookie_expires_new() -> HTTPCookie {
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