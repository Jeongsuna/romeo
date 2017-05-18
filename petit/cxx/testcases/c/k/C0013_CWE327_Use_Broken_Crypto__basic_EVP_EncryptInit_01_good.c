/*
Filename : C0013_CWE327_Use_Broken_Crypto__basic_EVP_EncryptInit_01_good.c
*/

#include <stdio.h>
#include <string.h>
#include <memory.h>
#include "std_testcase.h"
#include "ropenssl.h"


void C0013_CWE327_Use_Broken_Crypto__basic_EVP_EncryptInit_01_good(unsigned char *key, unsigned char *iv) {
	EVP_CIPHER_CTX ctx;
	EVP_CIPHER_CTX_init(&ctx);
	/* FIX */
	EVP_EncryptInit(&ctx, EVP_aes_128_cbc(), key, iv);
}