function C7002_HARDINFO_BAD_01() {
    const express = require('express');
    const mysql = require("mysql");
    const crypto = require("crypto");

    const dbQuery = "SELECT email, name FROM user WHERE name = 'test'";

    router.get("/vuln", (req, res) => {
        // 데이터베이스 연결에 필요한 인증 정보가 평문으로 하드코딩되어 있음
        const connection = mysql.createConnection({
            host: 'localhost',
            user: 'root',
            password: 'root1234',
            database: 'javascript',
            port: 3306,
        });

        connection.query(
            dbQuery, (err, result) => {
            if (err) return res.send(err);
            return res.send(result);
        })
    });
}
