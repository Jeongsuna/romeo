#include <cryptopp/gcm.h>

CryptoPP::GCM<CryptoPP::AES>::Encryption(); // Compliant

CryptoPP::RSAES<CryptoPP::OAEP<CryptoPP::SHA1>>::Encryptor(); // Compliant
