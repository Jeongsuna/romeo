//
//  C0006_REDIRECT_test.h
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#ifndef C0034_DIVBY0_h
#define C0034_DIVBY0_h

@interface C0034_DIVBY0_bad : NSObject

-(NSHTTPURLResponse*) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response;

@end

@interface C0034_DIVBY0_good : NSObject

-(NSHTTPURLResponse*) good:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response;

@end

#endif /* C0006_REDIRECT_test_h */
