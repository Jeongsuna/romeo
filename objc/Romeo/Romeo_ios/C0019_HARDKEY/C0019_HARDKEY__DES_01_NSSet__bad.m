//
//  C0019_HARDKEY__DES_01__bad.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 15..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <CommonCrypto/CommonCrypto.h>

//flaw using hard-coded cryptographic Key
#define ENCRYPT_KEY @"key39B0F"

@implementation C0019_HARDKEY__DES_01 : NSObject

-(NSString *) bad:(NSString *) str {
	NSData *data = [str dataUsingEncoding: NSUTF8StringEncoding];
	unsigned char *input = (unsigned char*)[data bytes];
	NSUInteger inLength = [data length];
	NSInteger outLength = ((inLength + kCCBlockSizeDES) & ~(kCCBlockSizeDES - 1));
	unsigned char *output =(unsigned char *)calloc(outLength, sizeof(unsigned char));
	bzero(output, outLength*sizeof(unsigned char));
	size_t additionalNeeded = 0;
	unsigned char *iv = (unsigned char *)calloc(kCCBlockSizeDES, sizeof(unsigned char));
	bzero(iv, kCCBlockSizeDES * sizeof(unsigned char));
    
    NSSet *setKeys = [[NSSet alloc] init];
    [setKeys setValue:@"key39B0F" forKey:@"key1"];
    [setKeys setValue:@"key29B0F" forKey:@"key2"];
    [setKeys setValue:@"key18B0F" forKey:@"key3"];
    
    //flaw using hard-coded cryptographic Key
    NSString *key = [setKeys valueForKey:@"key2"];
	const void *vkey = (const void *) [key UTF8String];
	
	CCCryptorStatus err = CCCrypt(kCCEncrypt,
								  kCCAlgorithmDES,
								  kCCOptionPKCS7Padding | kCCOptionECBMode,
								  vkey,
								  kCCKeySizeDES,
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
