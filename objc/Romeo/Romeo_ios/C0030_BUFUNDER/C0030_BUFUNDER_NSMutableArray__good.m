//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0030_BUFUNDER.h"

@implementation C0030_BUFUNDER_good : NSObject

-(NSHTTPURLResponse *) good:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
 
    
    NSMutableArray *mArrResult = [NSMutableArray new];
    
    if( [NSURLProtocol propertyForKey:@"resultSet" inRequest:request] != NULL){
        mArrResult =  [NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
    }
    
    int result =0;
    
    if([[mArrResult objectAtIndex:0] integerValue] < INT_MAX-1){
        
        result =  [[mArrResult objectAtIndex:0] integerValue] +1;
        
    }

    int numList[6] = {5,1,2,3,1,7};

    //fix:
    if(result < 0 || result > 5)  result =0;
    
    NSLog(@"%d/n",numList[result]);
    
    return response;
}

@end
