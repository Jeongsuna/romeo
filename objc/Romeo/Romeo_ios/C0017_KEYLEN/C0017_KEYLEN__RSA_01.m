//
//  C0017_KEYLEN__RSA_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 17..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0017_KEYLEN__RSA_01.h"

@implementation C0017_KEYLEN__RSA_01 : NSObject
-(void) bad: (NSData *)publicTag private: (NSData *)privateTag{
	NSMutableDictionary *privateKeyAttr = [[NSMutableDictionary alloc] init];
	NSMutableDictionary *publicKeyAttr = [[NSMutableDictionary alloc] init];
	NSMutableDictionary *keyPairAttr = [[NSMutableDictionary alloc] init];
	
	SecKeyRef publicKey = NULL;
	SecKeyRef privateKey = NULL;
	
	[keyPairAttr setObject:(__bridge id)kSecAttrKeyTypeRSA
					forKey:(__bridge id)kSecAttrKeyType];
	// src:
	[keyPairAttr setObject:[NSNumber numberWithInt:1024]
					forKey:(__bridge id)kSecAttrKeySizeInBits];
	
//	[privateKeyAttr setObject:[NSNumber numberWithBool:YES] forKey:(__bridge id)kSecAttrIsPermanent];
	[privateKeyAttr setObject:privateTag forKey:(__bridge id)kSecAttrApplicationTag];

	//[publicKeyAttr setObject:[NSNumber numberWithBool:YES] forKey:(__bridge id)kSecAttrIsPermanent];
	[publicKeyAttr setObject:publicTag forKey:(__bridge id)kSecAttrApplicationTag];

	[keyPairAttr setObject:privateKeyAttr forKey:(__bridge id)kSecPrivateKeyAttrs];
	[keyPairAttr setObject:publicKeyAttr forKey:(__bridge id)kSecPublicKeyAttrs];

	// Flaw:
	OSStatus err = SecKeyGeneratePair((__bridge CFDictionaryRef)keyPairAttr, &publicKey, &privateKey);
	
}
/*
-(void) good: (NSData *)publicTag private: (NSData *)privateTag{
	NSMutableDictionary *privateKeyAttr = [[NSMutableDictionary alloc] init];
	NSMutableDictionary *publicKeyAttr = [[NSMutableDictionary alloc] init];
	NSMutableDictionary *keyPairAttr = [[NSMutableDictionary alloc] init];
	
	SecKeyRef publicKey = NULL;
	SecKeyRef privateKey = NULL;
	
	[keyPairAttr setObject:(__bridge id)kSecAttrKeyTypeRSA
					forKey:(__bridge id)kSecAttrKeyType];
	// Fix:
	[keyPairAttr setObject:[NSNumber numberWithInt:2048]
					forKey:(__bridge id)kSecAttrKeySizeInBits];
	
	[privateKeyAttr setObject:[NSNumber numberWithBool:YES] forKey:(__bridge id)kSecAttrIsPermanent];
	[privateKeyAttr setObject:privateTag forKey:(__bridge id)kSecAttrApplicationTag];
	
	[publicKeyAttr setObject:[NSNumber numberWithBool:YES] forKey:(__bridge id)kSecAttrIsPermanent];
	[publicKeyAttr setObject:publicTag forKey:(__bridge id)kSecAttrApplicationTag];
	
	[keyPairAttr setObject:privateKeyAttr forKey:(__bridge id)kSecPrivateKeyAttrs];
	[keyPairAttr setObject:publicKeyAttr forKey:(__bridge id)kSecPublicKeyAttrs];
	
	// Fix:
	OSStatus err = SecKeyGeneratePair((__bridge CFDictionaryRef)keyPairAttr, &publicKey, &privateKey);
}
 */
@end
