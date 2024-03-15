function C7006_SSRF_GOOD_01() {
    const request = require('request');
    const express = require('express');

    router.get("/patched", async (req, res) => {
        const url = req.query.url;
        const whiteList = ['www.example.com', 'www.safe.com'];

        // 사용자가 입력한 URL을 화이트리스트로 검증한 후 그 결과를 반환하여
        // 검증되지 않은 주소로 요청을 보내지 않도록 제한
        if (whiteList.includes(url)) {
            await request(url, (err, response) => {
                const resData = response.body;
                return res.send(resData);
            });
        } else {
            return res.send('잘못된 요청입니다');
        }
    });
}
