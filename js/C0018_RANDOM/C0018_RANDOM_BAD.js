function C0018_RANDOM_BAD_01() {
    function getOtpNumber() {
        let randomStr = '';
        // Math.random 라이브러리는 보안기능에 사용하면 위험함
        for (let i = 0; i < 6; i++) {
            randomStr += String(Math.floor(Math.random() * 10))
        }
        return randomStr;
    }
}
