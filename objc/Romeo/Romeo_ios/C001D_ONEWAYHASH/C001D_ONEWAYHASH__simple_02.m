//
//  C001D_ONEWAYHASH__simple_02.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 18..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <CommonCrypto/CommonKeyDerivation.h>
#import "C001D_ONEWAYHASH__simple_02.h"

@implementation C001D_ONEWAYHASH__simple_02 : NSObject
-(void)bad: (char *) password passwordLen:(int) passwordLen
derivedKey:(uint8_t *)derivedKey derivedKeyLen:(int) derivedKeyLen {
	CCKeyDerivationPBKDF(kCCPBKDF2,
						 password,
						 passwordLen,
						 // FLAW:
						 0,
						 0,
						 kCCPRFHmacAlgSHA256,
						 100000,
						 derivedKey,
						 derivedKeyLen);
}
@end
