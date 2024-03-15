function C0005_FILEUPLOAD_GOOD_01() {
    const express = require('express');
    router.post("/patched", (req, res) => {
        const allowedMimeTypes = ["image/png", "image/jpeg"];
        const allowedSize = 5242880;
        const file = req.files.products;
        const fileName = file.name;
        // 업로드 한 파일 타입 검증을 통해 악성 스크립트 파일 업로드 방지
        if (allowedMimeTypes.indexOf(file.mimetype) < 0) {
            res.send("file type not allowed");
        } else {
            file.mv("/usr/app/temp/" + fileName, (err) => {
                if (err) return res.send(err);
                res.send("upload success");
            });
        }
    });
}