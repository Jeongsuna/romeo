function C0006_REDIRECT_GOOD_01() {
    const express = require('express');
    router.get("/patched", (req, res) => {
        const whitelist = ["http://safe-site.com", "https://www.example.com"];
        const url = req.query.url;
        // 화이트리스트에 포함된 주소가 아니라면 리다이렉트 없이 에러 반환
        if (whitelist.indexOf(url) < 0) {
            res.send("wrong url");
        } else {
            res.redirect(url);
        }
    });
}
