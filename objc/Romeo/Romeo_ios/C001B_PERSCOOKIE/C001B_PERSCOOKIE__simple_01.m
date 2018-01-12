//
//  C001B_PERSCOOKIE__simple_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 12..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C001B_PERSCOOKIE__simple_01.m"

@implementation C001B_PERSCOOKIE__simple_01 : NSObject
/*
- (void)bad:(NSString*) urlStr response:(NSHTTPURLResponse *) response {
	NSURL *url = [NSURL URLWithString:urlStr];
	if(url) {
		NSArray *cookies = [[NSArray alloc] init];
		cookies = [NSHTTPCookie cookiesWithResponseHeaderFields:[response allHeaderFields] forURL:url];
		for(NSHTTPCookie *cookie in cookies) {
			[[NSHTTPCookieStorage sharedHTTPCookieStorage] setCookie:cookie];
		}
	}
}
*/

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
