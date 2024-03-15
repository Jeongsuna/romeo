function C0005_FILEUPLOAD_BAD_01() {
    const express = require('express');
    router.post("/vuln", (req, res) => {
        const file = req.files.products;
        const fileName = file.name;
        // 업로드 한 파일 타입 검증 부재로 악성 스크립트 파일 업로드 가능
        file.mv("/usr/app/temp/" + fileName, (err) => {
            if (err) return res.send(err);
            res.send("upload success");
        });
    });
}
