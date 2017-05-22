/*
Filename : C0017_CWE310_Cryptographic_Issues__w32_opensslcrypt_01_bad.c
*/
#include <stdio.h>
#include <stdlib.h>
#include "std_testcase.h"
#include "ropenssl.h"

EVP_PKEY *RSAKey() {
	EVP_PKEY *pkey;
	RSA *rsa;
	/* FLAW */
	rsa = RSA_generate_key(512, 35, NULL, NULL);
	if (rsa == NULL) {
		printf("Error\n");
		return NULL;
	}
	pkey = EVP_PKEY_new();
	EVP_PKEY_assign_RSA(pkey, rsa);
	return pkey;
}
