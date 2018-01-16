//
//  C000F_FORMATI__NSLog_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 15..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C000F_FORMATI__NSLog_01.h"

@implementation C000F_FORMATI__NSLog_01 : NSObject

-(void) bad: (NSString *) arg additional:(NSString *) arg2 {
	NSLog(arg, arg2);
}

@end
