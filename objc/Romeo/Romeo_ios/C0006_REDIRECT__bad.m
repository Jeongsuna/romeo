//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0006_REDIRECT_test.h"

@implementation C0006_REDIRECT_test : NSObject

-(void) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
    NSURL *url = [NSURL URLWithString:urlStr];
    if(url) {
        NSDictionary *properties = [[NSMutableDictionary alloc] init];
        [properties setValue:@"ASIHTTPRequestTestCookie" forKey:NSHTTPCookieName];
        [properties setValue:@".cookie.com" forKey:NSHTTPCookieDomain];
        
        //Flaw: very long time
        [properties setValue:[NSDate dateWithTimeIntervalSinceNow:60*60*24*365] forKey:NSHTTPCookieExpires];
        [properties setValue:@"/asi-http-request/tests" forKey:NSHTTPCookiePath];
        NSHTTPCookie *cookie = [[NSHTTPCookie alloc] initWithProperties:properties];
        NSMutableArray<NSHTTPCookie *> *single = [[NSMutableArray alloc] init];
        [single addObject:cookie];
        
        [request setAllHTTPHeaderFields:[NSHTTPCookie requestHeaderFieldsWithCookies:single]];
    }
}

@end
