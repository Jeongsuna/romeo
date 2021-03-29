#include <openssl/evp.h>

EVP_PKEY* RSAKey() {
	EVP_PKEY* pkey;
	RSA* rsa;
	// 키값이 512 bit로 너무 짧다.
	rsa = RSA_generate_key(512, 35, NULL, NULL);
	if (rsa == NULL) {
		printf("Error\n");
		return NULL;
	}
	pkey = EVP_PKEY_new();
	EVP_PKEY_assign_RSA(pkey, rsa);
	return pkey;
}
