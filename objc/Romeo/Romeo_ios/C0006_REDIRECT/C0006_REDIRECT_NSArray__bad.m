//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0006_REDIRECT_NSArray.h"

@implementation C0006_REDIRECT_NSArray_bad : NSObject

-(NSHTTPURLResponse *) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {

    NSArray *result = [NSURLProtocol propertyForKey:@"resultSet" inRequest:request];

    NSURL *url ;
    
    if(result){
        NSString *urlString = [result objectAtIndex:0];
        if(urlString) {
            url = [NSURL URLWithString:urlString];
        }
    }
    
    if(url) {
        
        //flaw: using untrusted value
       response = [response initWithURL:url
                     MIMEType:response.MIMEType
        expectedContentLength:response.expectedContentLength
             textEncodingName:response.textEncodingName];
    }
    
    return response;
}

@end
