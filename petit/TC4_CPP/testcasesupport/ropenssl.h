#pragma once
#ifndef __ROPENSSL_H__
#define __ROPENSSL_H__

#include   <openssl/evp.h>
#include   <openssl/err.h>
#include   <openssl/rand.h>
#include   <openssl/crypto.h>

#define PLAIN_DATA_SIZE 32
#define NO_PAD 0
#define PAD 1
#define UNDEF -1
#define NO_IV 0
#define SET_IV 1
#define ENCRYPT 1
#define DECRYPT 0

EVP_CIPHER * EVP_seed_cbc();
int opensslcrypt( const EVP_CIPHER *cipher, int keylen, int setiv, int pad);

#endif // #ifndef __ROPENSSL_H__
