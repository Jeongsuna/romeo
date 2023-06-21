//
//  C0013_BROKNCRYPT__bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/22.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C909F_SECUREMODE.h"
//#include <botan/cipher_mode.h>
#include <cryptopp/aes.h>
#include <cryptopp/modes.h>
#include <cryptopp/rsa.h>
#include <openssl/evp.h>
#include <openssl/rsa.h>
//#include <botan/pubkey.h>
//#include <botan/rsa.h>
//#include <botan/auto_rng.h>

@implementation C909F_SECUREMODE__bad : NSObject

-(void) bad_botan {
    
//    Botan::Cipher_Mode::create("AES-256/ECB", Botan::Cipher_Dir::Encryption);       // Noncompliant
//    Botan::Cipher_Mode::create("AES-256/CBC/PKCS7", Botan::Cipher_Dir::Encryption); // Noncompliant
//
//    std::unique_ptr<Botan::RandomNumberGenerator> rng(new Botan::AutoSeeded_RNG);
//    Botan::RSA_PrivateKey rsaKey(*rng.get(), 2048);
//
//    Botan::PK_Encryptor_EME(rsaKey, *rng.get(), "PKCS1v15"); // Noncompliant

}

-(void) bad_crypto{
        
    CryptoPP::ECB_Mode<CryptoPP::AES>::Encryption(); // Noncompliant
    CryptoPP::CBC_Mode<CryptoPP::AES>::Encryption(); // Noncompliant

    CryptoPP::RSAES<CryptoPP::PKCS1v15>::Encryptor(); // Noncompliant

}

-(void) bad_openssl{
    
    int flen = 0;
    unsigned char * from;
    unsigned char * to = nullptr;
    RSA *key = nullptr;

    EVP_aes_128_ecb(); // Noncompliant
    EVP_aes_128_cbc(); // Noncompliant
    
    RSA_public_decrypt(flen, from, to, key, RSA_PKCS1_PADDING); // Noncompliant
    RSA_public_decrypt(flen, from, to, key, RSA_NO_PADDING); // Noncompliant

}

@end
