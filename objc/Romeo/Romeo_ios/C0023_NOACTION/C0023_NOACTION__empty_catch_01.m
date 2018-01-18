//
//  C0023_NOACTION__empty_catch_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 18..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <Foundation/NSException.h>
#import "C0023_NOACTION__empty_catch_01.h"

@implementation C0023_NOACTION__empty_catch_01 : NSObject
-(void) bad {
	@try {
		NSArray *array = [NSArray arrayWithObjects:@"Eezy",@"Tutorials", @"Website"];
		NSLog(@"Object at Indexed Subscript 2: %@", [array objectAtIndexedSubscript:2]);
		NSLog(@"Object at Indexed Subscript 3: %@", [array objectAtIndexedSubscript:3]);
	}
	@catch (NSException *theException) {
	}
	@finally {
		
	}
}
-(void) good {
	@try {
		NSArray *array = [NSArray arrayWithObjects:@"Eezy",@"Tutorials", @"Website"];
		NSLog(@"Object at Indexed Subscript 2: %@", [array objectAtIndexedSubscript:2]);
		NSLog(@"Object at Indexed Subscript 3: %@", [array objectAtIndexedSubscript:3]);
	}
	@catch (NSException *theException) {
		NSLog(@"index out of bound");
	}
	@finally {
		
	}
}
@end
