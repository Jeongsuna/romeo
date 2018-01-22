//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C000E_BUFOVER.h"

@implementation C000E_BUFOVER_bad : NSObject

-(NSHTTPURLResponse *) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
 
    
    NSMutableArray *mArrResult = [NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
    
   //flaw: buffer overflow
   char result = [[mArrResult objectAtIndex:0] charValue];
    
    return response;
}

@end
