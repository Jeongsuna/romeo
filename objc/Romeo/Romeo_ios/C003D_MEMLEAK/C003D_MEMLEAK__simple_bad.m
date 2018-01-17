//
//  C003D_MEMLEAK__simple_bad.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 17..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C003D_MEMLEAK__simple_bad.h"

@implementation Item : NSObject
	
@end

@implementation C003D_MEMLEAK__simple_bad : NSObject {
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
}
@end
