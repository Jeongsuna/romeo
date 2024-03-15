function C7006_SSRF_BAD_01() {
    const request = require('request');
    const express = require('express');

    router.get("/vuln", async (req, res) => {
        const url = req.query.url;

        // 사용자가 입력한 주소를 검증하지 않고 HTTP 요청을 보낸 후
        // 그 응답을 그대로 사용자에게 전달
        await request(url, (err, response) => {
            const resData = response.body;
            return res.send(resData);
        });
    });
}
