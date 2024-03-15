function C000D_RELUNTRUST_BAD_01() {
    const express = require('express');

    router.get("/admin", (req, res) => {
        // 쿠키에서 권한 정보를 가져옴
        const role = req.cookies.role;
        if (role === "admin") {
            // 쿠키에서 가져온 권한 정보로 관리자 페이지 접속 처리
            return res.render('admin', { title: '관리자 페이지' });
        } else {
            return res.send("사용 권한이 없습니다.");
        }
    });
}
