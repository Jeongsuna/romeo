//
//  C0006_REDIRECT_test.h
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#ifndef C000C_TYPEOVER_h
#define C000C_TYPEOVER_h

@interface C000C_TYPEOVER_bad : NSObject

-(NSHTTPURLResponse*) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response;

@end

@interface C000C_TYPEOVER_good : NSObject

-(NSHTTPURLResponse*) good:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response;

@end

#endif /* C0006_REDIRECT_test_h */
