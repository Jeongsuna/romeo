//
//  C0004_CMDI__simple_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 4..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0004_CMDI__simple_01.h"

@implementation C0004_CMDI__simple_01 : NSObject

-(void) bad:(NSString*) cmd {
//    char input[20];
//    scanf("input: %s", input);
//    NSString *str = [NSString stringWithCString:input encoding:NSASCIIStringEncoding];
    NSTask *task = [[NSTask alloc] init];
    // Flaw:
    [task setLaunchPath:cmd];
    [task setArguments:@[ @"-c", @"10"]];
    
    [task launch];
}

@end
