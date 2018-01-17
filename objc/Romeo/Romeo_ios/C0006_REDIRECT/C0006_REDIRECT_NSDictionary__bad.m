//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0006_REDIRECT_NSDictionary__bad.h"

@implementation C0006_REDIRECT_NSDictionary__bad : NSObject

-(NSHTTPURLResponse *) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
   
    
    NSDictionary *result = [NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
 
    NSString *url ;

    if(result){
        url = [result objectForKey:@"url"];
        
        if(url) {
            //flaw: using untrusted value
            [request setURL:url];
        }
    }
    return response;
}

@end
