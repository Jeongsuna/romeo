#include <openssl/ossl_typ.h>

// #define EVP_MAX_IV_LENGTH		16
// #define EVP_MAX_BLOCK_LENGTH		32

struct evp_cipher_st
	{
/*
	int nid;
	int block_size;
	int key_len;
	int iv_len;
	unsigned long flags;
	int (*init)(EVP_CIPHER_CTX *ctx, const unsigned char *key,
		    const unsigned char *iv, int enc);
	int (*do_cipher)(EVP_CIPHER_CTX *ctx, unsigned char *out,
			 const unsigned char *in, unsigned int inl);
	int (*cleanup)(EVP_CIPHER_CTX *);
	int ctx_size;
	int (*set_asn1_parameters)(EVP_CIPHER_CTX *, ASN1_TYPE *);
	int (*get_asn1_parameters)(EVP_CIPHER_CTX *, ASN1_TYPE *);
	int (*ctrl)(EVP_CIPHER_CTX *, int type, int arg, void *ptr);
	void *app_data;
*/
	} /* EVP_CIPHER */;

struct evp_cipher_ctx_st
	{
/*
	const EVP_CIPHER *cipher;
	ENGINE *engine;
	int encrypt;
	int buf_len;

	unsigned char  oiv[EVP_MAX_IV_LENGTH];
	unsigned char  iv[EVP_MAX_IV_LENGTH];
	unsigned char buf[EVP_MAX_BLOCK_LENGTH];
	int num;

	void *app_data;
	int key_len;
	unsigned long flags;
	void *cipher_data;
	int final_used;
	int block_mask;
	unsigned char final[EVP_MAX_BLOCK_LENGTH];
*/
	} /* EVP_CIPHER_CTX */;

struct evp_pkey_st
	{
/*
	int type;
	int save_type;
	int references;
	union	{
		char *ptr;
#ifndef OPENSSL_NO_RSA
		struct rsa_st *rsa;
#endif
#ifndef OPENSSL_NO_DSA
		struct dsa_st *dsa;
#endif
#ifndef OPENSSL_NO_DH
		struct dh_st *dh;
#endif
#ifndef OPENSSL_NO_EC
		struct ec_key_st *ec;
#endif
		} pkey;
	int save_parameters;
	STACK_OF(X509_ATTRIBUTE) *attributes;
*/
	} /* EVP_PKEY */;