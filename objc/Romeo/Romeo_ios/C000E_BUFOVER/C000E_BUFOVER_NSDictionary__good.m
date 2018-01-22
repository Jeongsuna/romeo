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
 
    
    NSDictionary *dicResult = [NSDictionary new];
    
    if([NSURLProtocol propertyForKey:@"resultSet" inRequest:request] != NULL){
        dicResult = [NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
    }
    
    
    //fix: check CHAR_MAX & CHAR_MIN
    
    if(  CHAR_MIN < [[dicResult valueForKey:@"result"] charValue]
       && [[dicResult valueForKey:@"result"] charValue] < CHAR_MAX ){
        
        char result =  [[dicResult valueForKey:@"result"] charValue];
        
    }
    
    return response;
}

@end
