//
//  C0027_USEFREED.h
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 22..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#ifndef C003B_RETLOCAL_h
#define C003B_RETLOCAL_h

@interface C003B_RETLOCAL_int_bad : NSObject

-(int*) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response;

@end

@interface C003B_RETLOCAL_char_bad : NSObject

-(char*) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response;

@end

@interface C003B_RETLOCAL_good : NSObject

-(NSHTTPURLResponse*) good:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response;

@end


#endif /* C0027_USEFREED_h */
