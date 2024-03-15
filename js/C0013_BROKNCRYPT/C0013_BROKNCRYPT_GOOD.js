function C0013_BROKNCRYPT_GOOD_01() {
    // 예제 1. 알고리즘으로 암호화하는 예시
    const crypto = require("crypto");

    function getEncText(plainText, key, iv) {
        // 권장 알고리즘인 AES를 사용하여 안전함
        const cipherAes = crypto.createCipheriv('aes-256-cbc', key, iv);

        const encryptedData = cipherAes.update(plainText, 'utf8', 'base64');
        const finalEnctypedData = cipherAes.final('base64');

        return encryptedData + finalEnctypedData;
    }
}

function C0013_BROKNCRYPT_GOOD_02() {
    // 예제 2. 해쉬 함수를 사용하는 예시
    const crypto = require("crypto");

    function makeSha256(plainText) {
        const salt = crypto.randomBytes(16).toString('hex');

        // 안전한 sha-256 해쉬함수 사용
        const hashText = crypto.createHash('sha256').update(plainText + salt).digest("hex");

        return hashText;
    }
}