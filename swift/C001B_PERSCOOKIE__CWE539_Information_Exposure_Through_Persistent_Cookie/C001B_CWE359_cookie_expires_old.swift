import Foundation

class C001B_CWE359_cookie_expires_old {
    func bad() -> NSHTTPCookie {
        let properties = [
            NSHTTPCookieDomain: "www.test.com",
            NSHTTPCookiePath: "/start",
            // Flaw
            NSHTTPCookieExpires : NSDate(timeIntervalSinceNow: (60*60*24*30*12)),
            NSHTTPCookieSecure: true
        ]
        return NSHTTPCookie(properties: properties)
    }

    func good() -> HTTPCookie {
        let properties = [
            NSHTTPCookieDomain: "www.test.com",
            NSHTTPCookiePath: "/start",
            //
            NSHTTPCookieExpires : NSDate(timeIntervalSinceNow: (60*60*24)),
            NSHTTPCookieSecure: true
        ]
        return NSHTTPCookie(properties: properties)
    }
}