//
//  C0053_REFLECTI__performSelector_02.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 17..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0053_REFLECTI__performSelector_02.h"

@implementation C0053_REFLECTI__performSelector_02 : NSObject
-(void) bad: (NSString*) arg obj:(NSString*) obj1 obj:(NSString*) obj2 {
	// Flaw:
	[self performSelector:NSSelectorFromString(arg) withObject:obj1 withObject:obj2];
}
@end
