//
//  C003D_MEMLEAK__NSSet_good.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 2. 9..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
	
	/* FIX: Ensure data is initialized before use */
	NSSet *data = [[NSSet alloc]init];
	
	@autoreleasepool {
		
		NSLog(@"%@",data);
	}
	
	[data dealloc];
	return 0;
}
