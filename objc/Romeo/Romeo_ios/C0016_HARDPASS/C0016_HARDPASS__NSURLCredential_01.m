//
//  C0016_HARDPASS__NSURLCredential_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 19..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0016_HARDPASS__NSURLCredential.h"

@implementation C0016_HARDPASS__NSURLCredential_01 : NSObject

-(void)bad:(NSURLSession *)session didReceiveChallenge:(NSURLAuthenticationChallenge *)challenge completionHandler:(void (^)(NSURLSessionAuthChallengeDisposition, NSURLCredential * _Nullable))completionHandler {
	NSString *user = @"user";
	NSString *pass = @"pass";
	
	NSURLProtectionSpace *space = [challenge protectionSpace];
	
	if([space receivesCredentialSecurely] == YES &&
	   [[space host] isEqualToString:@"host.com"] &&
	   [[space authenticationMethod] isEqualToString:NSURLAuthenticationMethodHTTPBasic]) {
		// Flaw: use hard coded password
		NSURLCredential *credential = [NSURLCredential credentialWithUser:user password:pass persistence:NSURLCredentialPersistenceForSession];
		
		completionHandler(NSURLSessionAuthChallengeUseCredential, credential);
	}
}

@end
