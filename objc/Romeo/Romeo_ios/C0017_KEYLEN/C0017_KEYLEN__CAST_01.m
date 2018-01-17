//
//  C0017_KEYLEN__CAST_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 17..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <CommonCrypto/CommonCrypto.h>
#import "C0017_KEYLEN__CAST_01.h"

@implementation C0017_KEYLEN__CAST_01 : NSObject
-(NSString *)bad: (NSString*) str key:(NSString*) key
	   outLength: (NSInteger) outLength iv: (unsigned char *)iv{
	NSData *data = [str dataUsingEncoding: NSUTF8StringEncoding];
	unsigned char *input = (unsigned char*)[data bytes];
	NSUInteger inLength = [data length];
	unsigned char *output =(unsigned char *)calloc(outLength, sizeof(unsigned char));
	bzero(output, outLength*sizeof(unsigned char));
	size_t additionalNeeded = 0;
	const void *vkey = (const void *) [key UTF8String];
	
	CCCryptorStatus err = CCCrypt(kCCEncrypt,
								  kCCAlgorithmCAST,
								  kCCOptionPKCS7Padding | kCCOptionECBMode,
								  vkey,
								  // Flaw:
								  kCCKeySizeMinCAST,
								  iv,
								  input,
								  inLength,
								  output,
								  outLength,
								  &additionalNeeded);
	free(iv);
	
	NSString *result = [[NSData dataWithBytesNoCopy:output length:(NSUInteger)additionalNeeded freeWhenDone:YES] base64Encoding];
	
	return result;
}
-(NSString *)good: (NSString*) str key:(NSString*) key
		outLength: (NSInteger) outLength iv: (unsigned char *)iv{
	NSData *data = [str dataUsingEncoding: NSUTF8StringEncoding];
	unsigned char *input = (unsigned char*)[data bytes];
	NSUInteger inLength = [data length];
	unsigned char *output =(unsigned char *)calloc(outLength, sizeof(unsigned char));
	bzero(output, outLength*sizeof(unsigned char));
	size_t additionalNeeded = 0;
	const void *vkey = (const void *) [key UTF8String];
	
	CCCryptorStatus err = CCCrypt(kCCEncrypt,
								  kCCAlgorithm3DES,
								  kCCOptionPKCS7Padding | kCCOptionECBMode,
								  vkey,
								  // Fix: >= 16 (128 bits)
								  kCCKeySizeMaxCAST,
								  iv,
								  input,
								  inLength,
								  output,
								  outLength,
								  &additionalNeeded);
	free(iv);
	
	NSString *result = [[NSData dataWithBytesNoCopy:output length:(NSUInteger)additionalNeeded freeWhenDone:YES] base64Encoding];
	
	return result;
}
@end
