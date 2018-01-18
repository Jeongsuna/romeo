//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0033_TYPEUNDER.h"

@implementation C0033_TYPEUNDER : NSObject

-(NSHTTPURLResponse *) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
 
    
    NSSet *setResult = [NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
    
    //flaw: Interger overflow
    int result = [[setResult valueForKey:@"result"] integerValue]-1;
    
    return response;
}

@end
