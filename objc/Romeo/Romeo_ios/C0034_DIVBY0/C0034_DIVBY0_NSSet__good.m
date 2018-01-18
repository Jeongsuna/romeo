//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0034_DIVBY0.h"

@implementation C0034_DIVBY0_good : NSObject

-(NSHTTPURLResponse *) good:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
 
    
    NSSet *setResult = [NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
    
    int defaultData = 56440;
    int result = [[setResult valueForKey:@"result"] integerValue];
    
    /* FIX: test for a zero denominator */
    if(result !=0){
        defaultData = defaultData / result;
    }

    return response;
}

@end
