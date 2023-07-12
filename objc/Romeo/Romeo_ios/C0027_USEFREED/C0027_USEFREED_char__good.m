//
//  C0027_USEFREED_char__good.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/19.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0027_USEFREED.h"

@implementation C0027_USEFREED_good : NSObject

-(NSHTTPURLResponse *) good:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
    
    
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
   
    
    
    
    
    
    
    
    return response;
}

@end
