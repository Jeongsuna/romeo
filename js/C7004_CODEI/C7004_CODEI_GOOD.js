function C7004_CODEI_GOOD_01() {
    const express = require('express');
    function alphanumeric(input_text) {
        // 정규표현식 기반 문자열 검사
        const letterNumber = /^[0-9a-zA-Z]+$/;
        if (input_text.match(letterNumber)) {
            return true;
        } else {
            return false;
        }
    }
    router.post("/patched/server", (req, res) => {
        let ret = null;
        const { data } = req.body;
        // 사용자 입력을 영문, 숫자로 제한하며, 만약 입력값 내에 특수문자가 포함되어
        // 있을 경우 에러 메시지를 반환
        if (alphanumeric(data)) {
            ret = eval(data);
        } else {
            ret = 'error';
        }
        return res.send({ ret });
    });
}
