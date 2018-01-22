//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C000E_BUFOVER.h"

@implementation C000E_BUFOVER_good : NSObject

-(NSHTTPURLResponse *) good:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
 
    
    NSMutableArray *mArrResult = [NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
    
    //fix: check CHAR_MAX & CHAR_MIN
    
    if(  CHAR_MIN < [[mArrResult objectAtIndex:0] charValue]
       && [[mArrResult objectAtIndex:0] charValue] < CHAR_MAX ){
        
        char result =  [[mArrResult objectAtIndex:0] charValue];
        
    }

    
    return response;
}

@end
