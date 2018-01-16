//
//  C000F_FORMATI__stringWithFormat_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 15..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C000F_FORMATI__stringWithFormat_01.h"

@implementation C000F_FORMATI__stringWithFormat_01 : NSObject

-(NSString*) bad: (NSString *) arg additional:(NSString *) arg2 {
	return [NSString stringWithFormat:arg, arg2];
}

@end
