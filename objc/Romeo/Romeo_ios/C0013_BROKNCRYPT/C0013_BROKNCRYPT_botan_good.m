#include <botan/cipher_mode.h>
#include <botan/pubkey.h>
#include <botan/rsa.h>

Botan::Cipher_Mode::create("AES-256/GCM", Botan::ENCRYPTION);  // Compliant

std::unique_ptr<Botan::RandomNumberGenerator> rng(new Botan::AutoSeeded_RNG);
Botan::RSA_PrivateKey rsaKey(*rng.get(), 2048);

Botan::PK_Encryptor_EME(rsaKey, *rng.get(), "OAEP"); // Compliant
