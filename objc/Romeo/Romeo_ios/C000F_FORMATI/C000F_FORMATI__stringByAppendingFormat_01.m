//
//  C000F_FORMATI__stringByAppendingFormat_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 15..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C000F_FORMATI__stringByAppendingFormat_01.h"

@implementation C000F_FORMATI__stringByAppendingFormat_01 : NSObject

-(NSString*) bad: (NSString *) arg additional:(NSString *) arg2 {
	NSString * returnStr = @"Format: ";
	return [returnStr stringByAppendingFormat:arg, arg2];
}

@end
