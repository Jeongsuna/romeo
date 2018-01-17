//
//  C0017_KEYLEN__Blowfish_01.h
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 17..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#ifndef C0017_KEYLEN__Blowfish_01_h
#define C0017_KEYLEN__Blowfish_01_h

@interface C0017_KEYLEN__Blowfish_01 : NSObject
-(NSString *)bad: (NSString*) str key:(NSString*) key
	   outLength: (NSInteger) outLength iv: (unsigned char *)iv;
-(NSString *)good: (NSString*) str key:(NSString*) key
		outLength: (NSInteger) outLength iv: (unsigned char *)iv;
@end

#endif /* C0017_KEYLEN__Blowfish_01_h */
