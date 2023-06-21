//
//  C0017_KEYLEN_bad.cpp
//  Romeo
//
//  Created by Seungcheol on 2023/06/14.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#include "C0017_KEYLEN_bad.h"
#include <botan/ec_group.h>
#include <botan/pubkey.h>
//#include <botan/rng.h>
//#include <botan/rsa.h>
//#include <botan/System_rng.h>
#include <botan/dl_group.h>
#include <cryptopp/dh.h>
#include <cryptopp/oids.h>
#include <cryptopp/rsa.h>
#include <cryptopp/rng.h>
#include <cryptopp/osrng.h>
#include <cryptopp/cryptlib.h>
#include <openssl/dh.h>
#include <openssl/dsa.h>
#include <openssl/ec.h>
#include <openssl/obj_mac.h>
#include <openssl/rsa.h>
@implementation C0017_KEYLEN_bad

-(void)botanBad {
//    // RSA
//    std::unique_ptr<Botan::RandomNumberGenerator> rng(new Botan::System_RNG);
//    Botan::RSA_PrivateKey rsaKey(*rng, 1024); // Noncompliant
//
//    // DSA / DH
//    Botan::DL_Group("modp/ietf/1024"); // Noncompliant
//    Botan::DL_Group("dsa/botan/1024"); // Noncompliant.
//
//    // EC
//    Botan::EC_Group("secp160k1");   // Noncompliant.
}

-(void)cryptoBad{


//    CryptoPP::RandomNumberGenerator rng;
//
//    // RSA
//    CryptoPP::InvertibleRSAFunction params;
//    params.Initialize(rng, 1024); // Noncompliant; 2nd argument "keySize" should be  ≥ 2048
//
//    // DSA
//    CryptoPP::DSA::PrivateKey privateKey;
//    privateKey.GenerateRandomWithKeySize(rng, 1024); // Noncompliant; 2nd argument "keySize" should be  ≥ 2048
//
//    // DH
//    CryptoPP::DH dh;
//    dh.AccessGroupParameters().GenerateRandomWithKeySize(rnd, 1024); // Noncompliant; 2nd argument "keySize" should be  ≥ 2048
//
//    // EC
//    CryptoPP::ASN1::secp112r1(); // Noncompliant; EC key length is 112. Should be ≥ 224
    
}

-(void)opensslBad{
    // RSA
    RSA *key = RSA_new();
    BIGNUM *e = BN_new();
    RSA_generate_key_ex(key, 1024, e, NULL);  // Noncompliant

    // DSA
    DSA *dsa = DSA_new();
    DSA_generate_parameters_ex(dsa, 1024, NULL, 0, NULL, NULL, NULL); // Noncompliant

    // DH
    DH *dh = DH_new();
    DH_generate_parameters_ex(dh, 1024, DH_GENERATOR_2, NULL); // Noncompliant

    // EC
    EC_KEY_new_by_curve_name(NID_secp112r1); // Noncompliant
}
@end




