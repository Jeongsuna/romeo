//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0025_USENULL.h"

@implementation C0025_USENULL_good : NSObject

-(NSHTTPURLResponse *) good:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
 
    
    NSMutableArray *mArrResult = [NSMutableArray new];
    
    /* check NULL */
    if([NSURLProtocol propertyForKey:@"resultSet" inRequest:request] != NULL){
        mArrResult = [NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
    }

    NSLog(@"%lu",[mArrResult count]);
    
    return response;
}

@end
