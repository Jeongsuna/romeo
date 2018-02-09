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
 
    
    NSMutableArray *mArrResult = [NSMutableArray new];
    
    if( [NSURLProtocol propertyForKey:@"resultSet" inRequest:request] != NULL){
        mArrResult =  [NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
    }
    
    
    int result = 0;
    
    if([[mArrResult objectAtIndex:0] integerValue] < INT_MAX-1){
        
        result =  [[mArrResult objectAtIndex:0] integerValue] +1;
        
    }

    char *data ='';
    
    //fix:
    if( 0 < result && result < 1000 ) data = (char*)malloc(sizeof(char) *result) ;
    
    return response;
}

@end
