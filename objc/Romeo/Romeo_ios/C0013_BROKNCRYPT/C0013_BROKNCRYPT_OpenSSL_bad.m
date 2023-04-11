#include <openssl/evp.h>
#include <openssl/rsa.h>
#import "C0013_BROKNCRYPT_OpenSSL_bad.h"
#include <openssl/evp.h>
#import <Foundation/Foundation.h>


@implementation C0013_BROKNCRYPT_OpenSSL_bad : NSObject
-(void)EVP_aes_128_ec{}; // Noncompliant
-(void)EVP_aes_128_cb{};

-(void)RSA_public_decrypt :flen form : from to :to key: key RSA_PKCS1_PADDINGvoid: RSA_PKCS1_PADDINGvoid{}; // Noncompliant

-(void)RSA_public_decrypt :flen form : from to :to key: key RSA_SSLV23_PADDING: RSA_SSLV23_PADDING{};// Noncompliant

-(void)RSA_public_decrypt :flen form : from to :to key: key RSA_NO_PADDIN: RSA_NO_PADDIN{};// Noncompliant



@end

// Example for a symmetric cipher: AES
 // Noncompliant

// Example for a asymmetric cipher: RSA
// Noncompliant
