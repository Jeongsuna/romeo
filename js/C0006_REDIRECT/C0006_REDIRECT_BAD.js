function C0006_REDIRECT_BAD_01() {
    const express = require('express');
    router.get("/vuln", (req, res) => {
        const url = req.query.url;
        // 사용자가 전달한 URL 주소를 검증 없이 그대로 리다이렉트 처리
        res.redirect(url);
    });
}
