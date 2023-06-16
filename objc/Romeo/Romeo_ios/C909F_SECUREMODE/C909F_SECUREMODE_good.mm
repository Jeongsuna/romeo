//
//
//  Romeo
//
//  Created by Seungcheol on 2023/03/22.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C909F_SECUREMODE.h"
//#include <botan/cipher_mode.h>
//#include <botan/pubkey.h>
//#include <botan/rsa.h>
//#include <botan/auto_rng.h>
#include <cryptopp/cryptlib.h>
#include <cryptopp/rsa.h>
#include <cryptopp/aes.h>
#include <cryptopp/modes.h>
#include <cryptopp/gcm.h>
#include <openssl/evp.h>
#include <openssl/rsa.h>

@implementation C909F_SECUREMODE__good : NSObject


-(void) good_botan{
    
//    Botan::Cipher_Mode::create("AES-256/GCM", Botan::Cipher_Dir::Encryption);  // Compliant
//
//    std::unique_ptr<Botan::RandomNumberGenerator> rng(new Botan::AutoSeeded_RNG);
//    Botan::RSA_PrivateKey rsaKey(*rng.get(), 2048);
//    Botan::PK_Encryptor_EME(rsaKey, *rng.get(), "OAEP"); // Compliant
//
    
}

-(void) good_crypto{

    CryptoPP::GCM<CryptoPP::AES>::Encryption(); // Compliant

    CryptoPP::RSAES<CryptoPP::OAEP<CryptoPP::SHA1>>::Encryptor(); // Compliant

}

-(void) good_openssl{
    int flen = 0;
    unsigned char * from;
    unsigned char * to = nullptr;
    RSA *key = nullptr;

    EVP_aes_128_gcm(); // Compliant

    RSA_public_decrypt(flen, from, to, key, RSA_PKCS1_OAEP_PADDING); // Compliant
    
}

@end

