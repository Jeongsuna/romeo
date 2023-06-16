//
//  C0017_KEYLEN_good.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/14.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import "C0017_KEYLEN_good.h"
#import <Foundation/Foundation.h>
#include <openssl/dh.h>
#include <openssl/dsa.h>
#include <openssl/ec.h>
#include <openssl/obj_mac.h>
#include <openssl/rsa.h>

@implementation C0017_KEYLEN_good

-(void)botanGood{
    
}
-(void)cryptoGood{
    
}
-(void)opensslGood{
    // RSA
    RSA *key = RSA_new();
    BIGNUM *e = BN_new();
    RSA_generate_key_ex(key, 2048, e, NULL);  // Noncompliant; 2nd argument "bits" must be ≥ 2048

    // DSA
    DSA *dsa = DSA_new();
    DSA_generate_parameters_ex(dsa, 2048, NULL, 0, NULL, NULL, NULL); // Noncompliant; 2nd argument "bits" must be ≥ 2048

    // DH
    DH *dh = DH_new();
    DH_generate_parameters_ex(dh, 2048, DH_GENERATOR_2, NULL); // Noncompliant; 2nd argument "prime_len" must be ≥ 2048

    // EC
    EC_KEY_new_by_curve_name(NID_secp224r1); // Noncompliant; EC key length is 112. Should be ≥ 224
}

@end
