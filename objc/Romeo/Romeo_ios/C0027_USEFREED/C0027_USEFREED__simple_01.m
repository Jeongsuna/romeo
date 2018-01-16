//
//  C0027_USEFREED__simple_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 12..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

@implementation C0027_USEFREED__simple_01 : NSObject

-(void) bad {
	C0027_USEFREED__simple_01 *c0027 = [[C0027_USEFREED__simple_01 alloc] init];
//	[c0027 release];
//	[c0027 echo: @"C0027_USEFREED__simple_01!"];
}

-(void)echo:(NSString*) str {
	NSLog(str);
}

@end
