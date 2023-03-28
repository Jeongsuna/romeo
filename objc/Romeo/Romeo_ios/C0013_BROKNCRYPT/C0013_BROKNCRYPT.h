//
//  C0013_BROKNCRYPT.h
//  Romeo
//
//  Created by Seungcheol on 2023/03/22.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#ifndef C0013_BROKNCRYPT_h
#define C0013_BROKNCRYPT_h

@interface C0013_BROKNCRYPT__bad : NSObject

-(void) bad_botan;
-(void) bad_crypto;
-(void) bad_OpenSSL;

@end

@interface C0013_BROKNCRYPT__good : NSObject

-(void) good_botan;
-(void) good_crypto;
-(void) good_OpenSSL;

@end

#endif /* C0013_BROKNCRYPT_h */
