//
//  C0023_NOACTION__writeToURL_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 18..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0023_NOACTION__writeToURL_01.h"

@implementation C0023_NOACTION__writeToURL_01 : NSObject
-(void)bad: (NSData*) doc url:(NSURL*) url {
	NSError *anyError;
	BOOL success = [doc writeToURL:url
									options:0
									  error:&anyError];
	if (!success) {
		NSLog(@"Write failed with error: %@", anyError);
	}
}
-(void)good: (NSData*) doc url:(NSURL*) url {
	NSError *anyError;
	BOOL success = [doc writeToURL:url
						   options:0
							 error:&anyError];
}
@end
