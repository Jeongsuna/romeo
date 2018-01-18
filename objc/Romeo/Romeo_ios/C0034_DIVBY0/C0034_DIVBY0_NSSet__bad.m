//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0034_DIVBY0.h"

@implementation C0034_DIVBY0_bad : NSObject

-(NSHTTPURLResponse *) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
 
    
    NSSet *setResult = [NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
    
    int defaultData = 56440;
    //flaw: divide by zero
    defaultData = defaultData / [[setResult valueForKey:@"result"] integerValue];
    
    return response;
}

@end
