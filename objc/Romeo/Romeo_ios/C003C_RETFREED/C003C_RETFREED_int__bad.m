//
//  C0027_USEFREED_int__bad.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 22..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C003B_RETLOCAL.h"

@implementation C003B_RETLOCAL_int_bad : NSObject

-(NSHTTPURLResponse *) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
    
    
    int *result = malloc(sizeof(int));
    if([NSURLProtocol propertyForKey:@"resultSet" inRequest:request] != NULL){
        
        if( [[NSURLProtocol propertyForKey:@"resultSet" inRequest:request] intValue] < INT_MAX-1 ){
            *result =
            [[NSURLProtocol propertyForKey:@"resultSet" inRequest:request] intValue] +1;
            
            free(result);
        }
            
    }
    
    //flaw:
    NSLog(@"%d",*result);
    return response;
}

@end

