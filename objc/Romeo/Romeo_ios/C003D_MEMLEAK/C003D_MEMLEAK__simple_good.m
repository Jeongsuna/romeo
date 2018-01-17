//
//  C003D_MEMLEAK__simple_good.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 17..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C003D_MEMLEAK__simple_good.h"

@implementation Item : NSObject

@end

@implementation C003D_MEMLEAK__simple_good : NSObject {
	Item *pen;
	Item *eraser;
}
-(id)init {
	self = [super init];
	if(self) {
		self->pen = [[Item alloc] init];
		self->eraser = [[Item alloc] init];
	}
	return self;
}

-(void)dealloc {
	[self->pen release];
	[self->eraser release];
}
@end
