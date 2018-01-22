//
//  C0027_USEFREED.h
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 22..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#ifndef C0027_USEFREED_h
#define C0027_USEFREED_h

@interface C0027_USEFREED_bad : NSObject

-(NSHTTPURLResponse*) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response;

@end

@interface C0027_USEFREED_good : NSObject

-(NSHTTPURLResponse*) good:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response;

@end


#endif /* C0027_USEFREED_h */
