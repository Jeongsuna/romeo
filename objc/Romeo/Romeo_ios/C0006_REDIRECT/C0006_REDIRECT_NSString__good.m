//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0006_REDIRECT_NSString.h"

@implementation C0006_REDIRECT_NSString_good : NSObject

-(NSHTTPURLResponse *) good:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
 
    NSURL *url ;
    
    NSArray *pageNameArr;
    pageNameArr = @[@"page1", @"page2", @"page3", @"page4"];
    
            //using whitelist
        switch ([pageNameArr indexOfObject:urlStr]) {
            case 0:
                url = [NSURL URLWithString:@"http://www.default.com/page1"];
                break;
            case 1:
                url = [NSURL URLWithString:@"http://www.default.com/page2"];
                break;
            case 2:
                url = [NSURL URLWithString:@"http:/www.default.com/page3"];
                break;
            case 3:
                break;
            default:
                url = [NSURL URLWithString:@"http:/www.default.com/main"];
                break;
        }
            
      
    if(url) {
        
        //flaw: using untrusted value
        response =[response initWithURL:url
                               MIMEType:response.MIMEType
                  expectedContentLength:response.expectedContentLength
                       textEncodingName:response.textEncodingName];
    }
    
    return response;
}

@end
