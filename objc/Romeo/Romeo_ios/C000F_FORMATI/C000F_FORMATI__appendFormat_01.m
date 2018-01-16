//
//  C000F_FORMATI__appendFormat_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 15..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C000F_FORMATI__appendFormat_01.h"

@implementation C000F_FORMATI__appendFormat_01 : NSObject

-(NSString*) bad: (NSString *) arg additional:(NSString *) arg2 {
	NSMutableString *returnStr = [[NSMutableString init] alloc];
	[returnStr appendFormat:arg, arg2];
	return returnStr;
}

@end
