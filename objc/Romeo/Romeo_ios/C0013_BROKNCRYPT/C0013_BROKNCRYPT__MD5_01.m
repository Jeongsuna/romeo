//
//  C0013_BROKNCRYPT__MD5_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 15..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <CommonCrypto/CommonDigest.h>

@implementation C0013_BROKNCRYPT__MD5_01 : NSObject

-(void) bad:(NSString *) str length:(int) length {
	const char *cStr = [str UTF8String];
	unsigned char result[length];
	CC_MD5(cStr, length, result);
}

@end
