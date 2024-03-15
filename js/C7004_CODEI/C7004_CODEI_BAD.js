function C7004_CODEI_BAD_01() {
    const express = require('express');
    router.post("/vuln/server", (req, res) => {
        // 사용자로부터 전달 받은 값을 그대로 eval 함수의 인자로 전달
        const data = eval(req.body.data);
        return res.send({ data });
    });
}