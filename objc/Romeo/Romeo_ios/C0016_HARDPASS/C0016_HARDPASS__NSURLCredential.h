//
//  C0016_HARDPASS__NSURLCredential.h
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 19..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#ifndef C0016_HARDPASS__NSURLCredential_h
#define C0016_HARDPASS__NSURLCredential_h
@interface C0016_HARDPASS__NSURLCredential_01 : NSObject
// source: https://developer.apple.com/library/content/documentation/Cocoa/Conceptual/URLLoadingSystem/Articles/AuthenticationChallenges.html#//apple_ref/doc/uid/TP40009507-SW1
-(void)bad:(NSURLSession *) session didReceiveChallenge:(NSURLAuthenticationChallenge *)challenge
completionHandler:(void (^)(NSURLSessionAuthChallengeDisposition disposition, NSURLCredential * __nullable credential))completionHandler);
@end

@interface C0016_HARDPASS__NSURLCredential_02 : NSObject
// source: https://developer.apple.com/library/content/documentation/Cocoa/Conceptual/URLLoadingSystem/Articles/AuthenticationChallenges.html#//apple_ref/doc/uid/TP40009507-SW1
-(void)bad:(NSURLSession *) session didReceiveChallenge:(NSURLAuthenticationChallenge *)challenge
completionHandler:(void (^)(NSURLSessionAuthChallengeDisposition disposition, NSURLCredential * __nullable credential))completionHandler);
@end
#endif /* C0016_HARDPASS__NSURLCredential_h */
