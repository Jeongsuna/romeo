function C0002_PATHMANIP_GOOD_01() {
    //예제 1
    const express = require('express');
    const path = require('path');
    router.get("/patched/file", (req, res) => {
        const requestFile = req.query.file;
        // 정규표현식을 사용해 사용자 입력값을 필터링
        const filtered = requestFile.replace(/[.\\\/]/gi, '');
        fs.readFile(filtered, 'utf8', function(err, data) {
            if (err) {
                return res.send('error');
            }
            return res.send(data);
        })
    });
}
function C0002_PATHMANIP_GOOD_02() {
    //예제 2
    const express = require('express');
    const io = require("socket.io");
    router.get("/patched/socket", (req, res) => {
        // 화이트리스트 내에 속하는 주소만 허용
        const whitelist = ["ws://localhost", "ws://127.0.0.1"];
        if (whitelist.indexOf(req.query.url) < 0) {
            return res.send("wrong url");
        }
        try {
            const socket = io(req.query.url);
            return res.send(socket);
        } catch (err) {
            return res.send("[error] fail to connect");
        }
    });
}