function C0010_MISSAUTH_BAD_01() {
    const express = require('express');
    const crypto = require("crypto");

    router.post("/vuln", (req, res) => {
        const newPassword = req.body.newPassword;
        const user = req.session.userid;
        const hs = crypto.createHash("sha256")
        const newHashPassword = hs.update(newPassword).digest("base64");

        // 현재 패스워드와 일치 여부를 확인하지 않고 업데이트
        updatePasswordFromDB(user, newHashPassword);

        return res.send({message: "패스워드가 변경되었습니다.", userId, password, hashPassword});
    });
}
