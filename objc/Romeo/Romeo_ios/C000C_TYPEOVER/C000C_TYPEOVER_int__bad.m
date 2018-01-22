//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C000C_TYPEOVER.h"

@implementation C000C_TYPEOVER_bad : NSObject

-(NSHTTPURLResponse *) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
 

    int result=0;
    
    if([NSURLProtocol propertyForKey:@"resultSet" inRequest:request] != NULL){
        
        //flaw: Interger overflow
        result = [[NSURLProtocol propertyForKey:@"resultSet" inRequest:request] intValue] +1;
    }

    
   
    
    return response;
}

@end
