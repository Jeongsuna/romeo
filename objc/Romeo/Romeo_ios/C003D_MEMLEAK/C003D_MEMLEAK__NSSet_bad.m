//
//  C003D_MEMLEAK__NSSet_bad.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 2. 9..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
	NSSet *data = [[NSSet alloc]init];
	
	@autoreleasepool {
		/* FLAW: Use data without initializing it */
		NSLog(@"%@",data);
	}
	
	return 0;
}
