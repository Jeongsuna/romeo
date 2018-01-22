//
//  C0027_USEFREED.h
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 22..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#ifndef C003A_DOUBLEFREE_h
#define C003A_DOUBLEFREE_h

@interface C003A_DOUBLEFREE_bad : NSObject

-(NSHTTPURLResponse*) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response;

@end

@interface C003A_DOUBLEFREE_good : NSObject

-(NSHTTPURLResponse*) good:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response;

@end


#endif /* C0027_USEFREED_h */
