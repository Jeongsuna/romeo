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
 
    
    NSSet *setResult = [NSSet new];
    
    /* check NULL */
    if([NSURLProtocol propertyForKey:@"resultSet" inRequest:request] != NULL){
        setResult =[NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
    }
    
    //fix: check INT_MAX
    if([[setResult valueForKey:@"result"] integerValue] < INT_MAX-1){
        
        int result =  [[setResult valueForKey:@"result"] integerValue]+1;
        
    }

    return response;
}

@end
