function C7002_HARDINFO_GOOD_01() {
    const express = require('express');
    const mysql = require("mysql");
    const crypto = require("crypto");

    const dbQuery = "SELECT email, name FROM user WHERE name = 'test'";

    // 32bytes
    const key = getCryptKey();
    // 16bytes
    const iv = getCryptIV();

    router.get("/patched", (req, res) => {
        // 설정파일에 암호화 되어 있는 user, password 정보를 가져와 복호화 한 후 사용
        const decipher = crypto.createDecipheriv('aes-256-cbc', key, iv);
        const user = decipher.update(process.env.USER, 'base64', 'utf8') + decipher.final('utf8');
        const decipher2 = crypto.createDecipheriv('aes-256-cbc', key, iv);
        const password = decipher2.update(process.env.PASSWORD, 'base64', 'utf8') + decipher2.final('utf8');

        // DB 연결 정보도 설정파일에서 가져와 사용
        const connection = mysql.createConnection({
            host: process.env.DB_HOST,
            user: user,
            password: password,
            database: process.env.DB_NAME,
            port: process.env.PORT,
        });
        //...
    })
}
