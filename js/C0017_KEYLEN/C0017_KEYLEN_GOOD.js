function C0017_KEYLEN_BAD_01() {
    const crypto = require("crypto");

    function vulnMakeRsaKeyPair() {
        // RSA키 길이를 2048 비트(modulusLength: 2048)로 설정해 안전함
        const { publicKey, privateKey } = crypto.generateKeyPairSync('rsa',
            {
                modulusLength: 2048,
                publicKeyEncoding: { type: "spki", format: 'pem' },
                privateKeyEncoding: { type: "pkcs8", format: 'pem' }
            });
        return { PRIVATE: publicKey, PUBLIC: privateKey }
    }

    function vulnMakeEcc() {
        // ECC 키 길이를 256 비트(namedCurve: 'secp256k1')로 설정해 안전함
        const { publicKey, privateKey } = crypto.generateKeyPairSync('ec', {
            namedCurve: 'secp256k1',
            publicKeyEncoding: { type: 'spki', format: 'der' },
            privateKeyEncoding: { type: 'pkcs8', format: 'der' }
        });
        return { PRIVATE: publicKey.toString('hex'), PUBLIC: privateKey.toString('hex') }
    }
}
