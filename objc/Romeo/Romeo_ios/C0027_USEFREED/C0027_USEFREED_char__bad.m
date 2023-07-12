//
//  C0027_USEFREED__simple_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 12..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "C0027_USEFREED.h"

@implementation C0027_USEFREED_bad : NSObject

-(NSHTTPURLResponse *) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
    
    
    char *result = (char*)malloc(CHAR_BIT);
    
    if([NSURLProtocol propertyForKey:@"resultSet" inRequest:request] != NULL){
        
        //fix: check CHAR_MAX & CHAR_MIN
        
        if(  CHAR_MIN <
           [[NSURLProtocol propertyForKey:@"resultSet" inRequest:request] charValue]
           && [[NSURLProtocol propertyForKey:@"resultSet" inRequest:request] charValue]
           < CHAR_MAX ){
        
            result =
            [[NSURLProtocol propertyForKey:@"resultSet" inRequest:request] charValue];
            
        }
    }
    
    /*...
     
     
     
     ...*/
    
    free(result);
   
    
    //flaw:
    NSLog(@"%s",result);
    
    
    
    
    
    
    return response;
}

@end


