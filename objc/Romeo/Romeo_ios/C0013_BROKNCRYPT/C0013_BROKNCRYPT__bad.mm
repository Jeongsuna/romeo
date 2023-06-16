//
//  C0013_BROKNCRYPT__bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/22.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0013_BROKNCRYPT.h"
#include <botan/cipher_mode.h>
#include <cryptopp/arc4.h>
#include <cryptopp/blowfish.h>
#include <cryptopp/cast.h>
#include <cryptopp/des.h>
#include <cryptopp/gost.h>
#include <cryptopp/idea.h>
#include <cryptopp/rc2.h>
#include <cryptopp/tea.h>
#include <openssl/evp.h>

@implementation C0013_BROKNCRYPT__bad : NSObject

-(void) bad_botan{

    Botan::Cipher_Mode::create("Blowfish/CBC/PKCS7", Botan::Cipher_Dir::Encryption);      // Noncompliant
    Botan::Cipher_Mode::create("DES/CBC/PKCS7", Botan::Cipher_Dir::Encryption);           // Noncompliant
    Botan::Cipher_Mode::create("3DES/CBC/PKCS7", Botan::Cipher_Dir::Encryption);          // Noncompliant
    Botan::Cipher_Mode::create("DESX/CBC/PKCS7", Botan::Cipher_Dir::Encryption);          // Noncompliant
    Botan::Cipher_Mode::create("CAST-128/CBC/PKCS7", Botan::Cipher_Dir::Encryption);      // Noncompliant
    Botan::Cipher_Mode::create("GOST-28147-89/CBC/PKCS7", Botan::Cipher_Dir::Encryption); // Noncompliant
    Botan::Cipher_Mode::create("IDEA/CBC/PKCS7", Botan::Cipher_Dir::Encryption);          // Noncompliant
    Botan::Cipher_Mode::create("KASUMI/CBC/PKCS7", Botan::Cipher_Dir::Encryption);        // Noncompliant
    Botan::Cipher_Mode::create("MISTY1/CBC/PKCS7", Botan::Cipher_Dir::Encryption);        // Noncompliant
    Botan::Cipher_Mode::create("XTEA/CBC/PKCS7", Botan::Cipher_Dir::Encryption);          // Noncompliant
    Botan::Cipher_Mode::create("RC4",Botan::Cipher_Dir::Encryption);
}

-(void) bad_crypto{
    
    Byte key[CryptoPP::DES::S] = {"Key"};
    CryptoPP::ARC4::Encryption(key, sizeof(key)); // Noncompliant
    CryptoPP::Blowfish::Encryption(key, sizeof(key)); // Noncompliant
    CryptoPP::GOST::Encryption(key, sizeof(key)); // Noncompliant
    CryptoPP::IDEA::Encryption(key, sizeof(key)); // Noncompliant
    CryptoPP::XTEA::Encryption(key, sizeof(key)); // Noncompliant
    CryptoPP::DES::Encryption(key, sizeof(key)); // Noncompliant
    CryptoPP::DES_EDE2::Encryption(key, sizeof(key)); // Noncompliant
    CryptoPP::DES_EDE3::Encryption(key, sizeof(key)); // Noncompliant
    CryptoPP::DES_XEX3::Encryption(key, sizeof(key)); // Noncompliant
    CryptoPP::RC2::Encryption(key, sizeof(key)); // Noncompliant
    CryptoPP::RC2Encryption(key, sizeof(key)); // Noncompliant
    CryptoPP::RC2Decryption(key, sizeof(key)); // Noncompliant

}

-(void) bad_openssl{

    EVP_bf_cbc(); // Noncompliant
    EVP_cast5_cbc(); // Noncompliant
    EVP_des_cbc(); // Noncompliant
    EVP_idea_cbc(); // Noncompliant
    EVP_rc4(); // Noncompliant
    EVP_rc2_cbc(); // Noncompliant

}

@end
