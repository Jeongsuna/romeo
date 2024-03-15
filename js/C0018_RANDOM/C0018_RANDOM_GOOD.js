function C0018_RANDOM_GOOD_01() {
    const crypto = require("crypto");

    function getOtpNumber() {
        // 보안기능에 적합한 난수 생성용 crypto 라이브러리 사용
        const array = new Uint32Array(1);
        // 브라우저에서는 crypto 대신에 window.crypto를 사용
        const randomStr = crypto.getRandomValues(array);
        let result;
        for (let i = 0; i < randomStr.length; i++) {
            result = array[i];
        }
        return String(result).substring(0, 6);
    }
}
