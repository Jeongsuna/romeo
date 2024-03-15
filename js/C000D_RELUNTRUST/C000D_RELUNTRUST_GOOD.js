function C000D_RELUNTRUST_BAD_01() {
    const express = require('express');
    const session = require("express-session");

    app.use(session({
        secret: 'test',
        resave: true,
        saveUninitialized: true,
        store: new MemoryStore({ checkPeriod: 60 * 60 * 1000 })
    }));

    router.get("/patched", (req, res) => {
        // 쿠키가 아닌 세션에서 권한 정보를 가져옴
        const role = req.session.role;
        if (role === "admin") {
            // 세션에서 가져온 권한 정보로 관리자 페이지 접속 처리
            return res.render('admin', { title: '관리자 페이지' });
        } else {
            return res.send("사용 권한이 없습니다.");
        }
    });
}
