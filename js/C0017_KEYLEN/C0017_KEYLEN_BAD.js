function C0017_KEYLEN_BAD_01() {
    const crypto = require("crypto");

    function vulnMakeRsaKeyPair() {
        // RSA키 길이를 1024 비트(modulusLength: 1024)로 설정하는 경우 안전하지 않음
        const { publicKey, privateKey } = crypto.generateKeyPairSync('rsa',
            {
                modulusLength: 1024,
                publicKeyEncoding: { type: "spki", format: 'pem' },
                privateKeyEncoding: { type: "pkcs8", format: 'pem' }
            });
        return { PRIVATE: publicKey, PUBLIC: privateKey }
    }

    function vulnMakeEcc() {
        // ECC 키 길이가 224비트 이하(namedCurve: 'secp192k1')이면 안전하지 않음
        const { publicKey, privateKey } = crypto.generateKeyPairSync('ec', {
            namedCurve: 'secp192k1',
            publicKeyEncoding: { type: 'spki', format: 'der' },
            privateKeyEncoding: { type: 'pkcs8', format: 'der' }
        });
        return { PRIVATE: publicKey.toString('hex'), PUBLIC: privateKey.toString('hex') }
    }
}
