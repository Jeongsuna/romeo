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
 
    
    //fix: check INT_MAX
  
    if( [[NSURLProtocol propertyForKey:@"resultSet" inRequest:request] integerValue] < INT_MAX-1 ){
        
        int result =
        [[NSURLProtocol propertyForKey:@"resultSet" inRequest:request] integerValue] +1;
        
    }
 
    
    
    return response;
}

@end
