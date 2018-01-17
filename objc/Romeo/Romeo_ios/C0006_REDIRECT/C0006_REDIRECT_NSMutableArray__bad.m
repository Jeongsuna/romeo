//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0006_REDIRECT_NSMutableArray__bad.h"

@implementation C0006_REDIRECT_NSMutableArray__bad : NSObject

-(NSHTTPURLResponse *) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {

    NSMutableArray *result = [NSURLProtocol propertyForKey:@"resultSet" inRequest:request];

    NSString *url ;

    if(result){
        url = [result objectAtIndex:0];
        if(url) {
            //flaw: using untrusted value
            [request setURL:url];
        }
    }
    return response;
}

@end
