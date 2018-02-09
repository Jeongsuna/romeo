//
//  C0027_USEFREED_int__bad.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 22..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C003B_RETLOCAL.h"

@implementation C003B_RETLOCAL_int_bad : NSObject
#define STR_MAX 10
-(char *) bad:(NSString*) urlStr request:(NSMutableURLRequest*) request response:(NSHTTPURLResponse *) response {
    
    char *name = malloc(sizeof(char)*STR_MAX);
    name = "Hello";

    return name;
}

@end

