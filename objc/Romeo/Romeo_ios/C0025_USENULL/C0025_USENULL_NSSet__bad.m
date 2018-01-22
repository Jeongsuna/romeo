//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0025_USENULL.h"

@implementation C0025_USENULL_bad : NSObject

-(NSHTTPURLResponse *) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
 
    /* flaw: NULL Pointer Dereference */
    NSSet *setResult = [NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
       
    return response;
}

@end
