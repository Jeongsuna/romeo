//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C000C_TYPEOVER.h"

@implementation C000C_TYPEOVER_good : NSObject

-(NSHTTPURLResponse *) good:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
 
    
    NSMutableArray *mArrResult = [NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
    
    
    //fix: check INT_MAX
    
    if([[mArrResult objectAtIndex:0] integerValue] < INT_MAX-1){
        
        int result =  [[mArrResult objectAtIndex:0] integerValue] +1;
        
    }


    
    return response;
}

@end
