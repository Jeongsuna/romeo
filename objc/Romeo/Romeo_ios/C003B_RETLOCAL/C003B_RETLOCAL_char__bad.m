//
//  C0027_USEFREED__simple_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 12..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "C003B_RETLOCAL.h"

@implementation C003B_RETLOCAL_char_bad : NSObject

-(char *) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
    
    char *result = 'res';
    
    if([NSURLProtocol propertyForKey:@"resultSet" inRequest:request] != NULL){
                
        if(  CHAR_MIN <
           [[NSURLProtocol propertyForKey:@"resultSet" inRequest:request] charValue]
           && [[NSURLProtocol propertyForKey:@"resultSet" inRequest:request] charValue]
           < CHAR_MAX ){
        
            *result =
            [[NSURLProtocol propertyForKey:@"resultSet" inRequest:request] charValue];
            
        }
    }
    
    //flaw:
    return result;
}

@end


