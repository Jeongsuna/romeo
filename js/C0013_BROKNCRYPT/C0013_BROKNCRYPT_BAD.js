function C0013_BROKNCRYPT_BAD_01() {
    // 예제 1. 알고리즘으로 암호화하는 예시
    const crypto = require("crypto");

    function getEncText(plainText, key) {
        // 취약한 알고리즘인 DES를 사용하여 안전하지 않음
        const cipherDes = crypto.createCipheriv('des-ecb', key, '');

        const encryptedData = cipherDes.update(plainText, 'utf8', 'base64');
        const finalEnctypedData = cipherDes.final('base64');

        return encryptedData + finalEnctypedData;
    }
}

function C0013_BROKNCRYPT_BAD_02() {
    // 예제 2. 해쉬 함수를 사용하는 예시
    const crypto = require("crypto");

    function makeMd5(plainText) {
        // 취약한 md5 해쉬함수 사용
        const hashText = crypto.createHash('md5').update(plainText).digest("hex");

        return hashText;
    }
}