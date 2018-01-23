//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0031_ALLOCSIZE.h"

@implementation C0031_ALLOCSIZE_good : NSObject

-(NSHTTPURLResponse *) good:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
 
    
    NSDictionary *dicResult = [NSDictionary new];
    
    if([NSURLProtocol propertyForKey:@"resultSet" inRequest:request] != NULL){
        dicResult = [NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
    }
    
    
    int result = 0;
    
    if([[dicResult valueForKey:@"result"] integerValue] < INT_MAX-1 ){
        
        result =  [[dicResult valueForKey:@"result"] integerValue] +1;
        
    }

    char *data ='';
    
    //fix:
    if( 0 < result ) data = (char*)malloc(sizeof(char) *result) ;
    
    return response;
}

@end
