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
 
    
    NSSet *setResult = [NSSet new];
    
    /* check NULL */
    if([NSURLProtocol propertyForKey:@"resultSet" inRequest:request] != NULL){
        setResult =[NSURLProtocol propertyForKey:@"resultSet" inRequest:request];
    }
    
    int result = 0;
    
    if([[setResult valueForKey:@"result"] integerValue] < INT_MAX-1){
        
        result =  [[setResult valueForKey:@"result"] integerValue]+1;
        
    }
    
    int numList[6] = {5,1,2,3,1,7};
    //flaw:
    NSLog(@"%d/n",numList[result]);
    

    return response;
}

@end
