//
//  C0006_REDIRECT_test.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0033_TYPEUNDER.h"

@implementation C0033_TYPEUNDER_good : NSObject

-(NSHTTPURLResponse *) good:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
 
    
    NSDictionary *dicResult = [NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
    
    //fix: check INT_MIN
    
    if(INT_MIN +1 < [[dicResult valueForKey:@"result"] integerValue]){
        
        int result =  [[dicResult valueForKey:@"result"] integerValue] -1;
        
    }

    
    return response;
}

@end
