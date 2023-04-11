#import "C0013_BROKNCRYPT_OpenSSL_good.h"
#include <openssl/evp.h>
#import <Foundation/Foundation.h>


@implementation C0013_BROKNCRYPT_OpenSSL_good : NSObject
-(void)EVP_aes_128_gc{}; // Compliant
-(void)RSA_public_decrypt : flen from: from to : to key: key RSA_PKCS1_OAEP_PADDING:RSA_PKCS1_OAEP_PADDING{}; // Compliant
@end
