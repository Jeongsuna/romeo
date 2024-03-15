function C001A_WEAKPASS_BAD_01() {
    const express = require('express');
    const mysql = require("mysql");
    const connection = mysql.createConnection(
        //...
    );

    router.post("/vuln", (req, res) => {
        const con = connection;
        const { email, password, name } = req.body;
        // 패스워드 생성 규칙 검증 없이 회원 가입 처리
        con.query(
            "INSERT INTO user (email, password, name) VALUES (?, ?, ?)",
            [email, password, name],
            (err, result) => {
            if (err) return res.send(err);
            return res.send("회원가입 성공");
        });
    });
}
