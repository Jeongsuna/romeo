//
//  C0013_BROKNCRYPT__good.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/22.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0013_BROKNCRYPT.h"
#include <botan/cipher_mode.h>
#include <cryptopp/aes.h>
#include <openssl/evp.h>

@implementation C0013_BROKNCRYPT__good : NSObject

-(void) good_botan{

    Botan::Cipher_Mode::create("AES-256/GCM", Botan::ENCRYPTION);  // Compliant
}

-(void) good_crypto{
    Byte key[CryptoPP::AES::DEFAULT_KEYLENGTH] = {"Key"};
    CryptoPP::AES::Encryption(key, sizeof(key));  //Compliant

}

-(void) good_OpenSSL{

    EVP_aes_128_gcm(); // Compliant
}


@end
