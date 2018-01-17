//
//  C0016_HARDPASS_bad.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 17..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "C0018_RANDOM.h"

@implementation C0018_RANDOM_good : NSObject

-(void) bad:(NSString *) example{
    
    int a;

    a = arc4random_uniform(10);
    
    NSString *resultNum = [NSString stringWithFormat:@"%d",a];
    
}

@end
