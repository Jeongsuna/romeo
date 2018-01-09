//
//  C0003_XSS__simple_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 4..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0003_XSS__simple_01.h"

@implementation C0003_XSS__simple_01 : NSObject

-(void) bad:(UIWebView*) webView arg:(NSString *) arg {
    NSString *javascript = [[NSString alloc] initWithFormat:@"var myvar=\"%@\";", arg];
    NSLog(@"%@", [webView stringByEvaluatingJavaScriptFromString:javascript]);
}

@end
