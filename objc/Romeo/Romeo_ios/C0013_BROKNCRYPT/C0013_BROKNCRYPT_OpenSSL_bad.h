//
//  C0013_BROKNCRYPT_OpenSSL_bad.h
//  Romeo
//
//  Created by Seungcheol on 2023/04/10.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#ifndef C0013_BROKNCRYPT_OpenSSL_bad_h
#define C0013_BROKNCRYPT_OpenSSL_bad_h
#import <Foundation/Foundation.h>

@interface C0013_BROKNCRYPT_OpenSSL_bad : NSOject

-(void)EVP_aes_128_ecb; // Noncompliant
-(void)EVP_aes_128_cb; // Noncompliant

// Example for a asymmetric cipher: RSA
-(void)RSA_public_decrypt; // Noncompliant
-(void)RSA_public_decrypt; // Noncompliant
-(void)RSA_public_decrypt; // Noncompliant
@end

#endif /* C0013_BROKNCRYPT_OpenSSL_bad_h */
