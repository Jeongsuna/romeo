//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0030_BUFUNDER.h"

@implementation C0030_BUFUNDER_bad : NSObject

-(NSHTTPURLResponse *) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
 
    
    //fix: check INT_MAX
  
    int result = 0;
    if([NSURLProtocol propertyForKey:@"resultSet" inRequest:request] != NULL){
 
        if( [[NSURLProtocol propertyForKey:@"resultSet" inRequest:request] intValue] < INT_MAX-1 ){
            result =
            [[NSURLProtocol propertyForKey:@"resultSet" inRequest:request] intValue] +1;
            }
    }
    
    int numList[6] = {5,1,2,3,1,7};
    //flaw:
    NSLog(@"%d/n",numList[result]);
    
    return response;
}

@end
