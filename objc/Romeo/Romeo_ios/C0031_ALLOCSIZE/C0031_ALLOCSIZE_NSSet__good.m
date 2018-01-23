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
 
    
    NSSet *setResult = [NSSet new];
    
    /* check NULL */
    if([NSURLProtocol propertyForKey:@"resultSet" inRequest:request] != NULL){
        setResult =[NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
    }
    
    int result = 0;
    
    if([[setResult valueForKey:@"result"] integerValue] < INT_MAX-1){
        
        result =  [[setResult valueForKey:@"result"] integerValue]+1;
        
    }
    
    char *data ='';
    
    //fix:
    if( 0 < result < sizeof(char)) (char*)malloc(result) ;

    return response;
}

@end
