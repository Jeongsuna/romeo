//
//  C0006_REDIRECT_test.h
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#ifndef C0030_BUFUNDER_h
#define C0030_BUFUNDER_h

@interface C0030_BUFUNDER_bad : NSObject

-(NSHTTPURLResponse*) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response;

@end

@interface C0030_BUFUNDER_good : NSObject

-(NSHTTPURLResponse*) good:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response;

@end

#endif /* C0006_REDIRECT_test_h */
