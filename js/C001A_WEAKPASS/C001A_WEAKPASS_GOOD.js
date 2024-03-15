function C001A_WEAKPASS_GOOD_01() {
    const express = require('express');
    const mysql = require("mysql");
    const connection = mysql.createConnection(
        //...
    );

    router.post("/patched", (req, res) => {
        const con = connection;
        const { email, password, name } = req.body;

        function checkPassword(password) {
            // 2종 이상 문자로 구성된 8자리 이상 비밀번호 검사 정규식
            const pt1 = /^(?=.*[A-Z])(?=.*[a-z])[A-Za-z\d!@#$%^&*]{8,}$/;
            const pt2 = /^(?=.*[A-Z])(?=.*\d)[A-Za-z\d!@#$%^&*]{8,}$/;
            const pt3 = /^(?=.*[A-Z])(?=.*[!@#$%^&*])[A-Za-z\d!@#$%^&*]{8,}$/;
            const pt4 = /^(?=.*[a-z])(?=.*\d)[A-Za-z\d!@#$%^&*]{8,}$/;
            const pt5 = /^(?=.*[a-z])(?=.*[!@#$%^&*])[A-Za-z\d!@#$%^&*]{8,}$/;
            const pt6 = /^(?=.*\d)(?=.*[!@#$%^&*])[A-Za-z\d!@#$%^&*]{8,}$/;
            // 문자 구성 상관없이 10자리 이상 비밀번호 검사 정규식
            const pt7 = /^[A-Za-z\d!@#$%^&*]{10,}$/;

            for (let pt of [pt1, pt2, pt3, pt4, pt5, pt6, pt7]) {
                console.log(pt.test(password));
                if (pt.test(password)) return true;
            }
            return false;
        }

        if (checkPassword(password)) {
            con.query(
                "INSERT INTO user (email, password, name) VALUES (?, ?, ?)",
                [email, password, name],
                (err, result) => {
                if (err) return res.send(err);
                return res.send("회원가입 성공");
            }
        );
        } else {
            return res.send("비밀번호는 영문 대문자, 소문자, 숫자, 특수문자 조합 중 2가지 이상 8자리이거나 문자 구성 상관없이 10자리 이상이어야 합니다.");
        }
    });
}
