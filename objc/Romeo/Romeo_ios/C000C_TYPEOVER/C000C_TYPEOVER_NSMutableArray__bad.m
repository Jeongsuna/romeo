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
 
    
    NSMutableArray *mArrResult = [NSMutableArray new];
    
    if( [NSURLProtocol propertyForKey:@"resultSet" inRequest:request] != NULL){
        mArrResult =  [NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
    }
    
   //flaw: Interger overflow
   int result = [[mArrResult objectAtIndex:0] integerValue]+1;
    
    return response;
}

@end
