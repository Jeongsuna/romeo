function C0002_PATHMANIP_BAD_01() {
    //예제1
    const express = require('express');
    const path = require('path');
    router.get("/vuln/file", (req, res) => {
        // 외부 입력값으로부터 파일명을 입력 받음
        const requestFile = req.query.file;
        // 입력값을 검증 없이 파일 처리에 사용
        fs.readFile(path.resolve(__dirname, requestFile), 'utf8', function(err, data) {
            if (err) {
                return res.send('error');
            }
            return res.send(data);
        })
    });
}
function C0002_PATHMANIP_BAD_02() {
    //예제2
    const express = require('express');
    const io = require("socket.io");
    router.get("/vuln/socket", (req, res) => {
        try {
            // 외부로부터 입력받은 검증되지 않은 주소를 이용하여
            // 소켓을 바인딩 하여 사용하고 있어 안전하지 않음
            const socket = io(req.query.url);
            return res.send(socket);
        } catch (err) {
            return res.send("[error] fail to connect");
        }
    });
}
