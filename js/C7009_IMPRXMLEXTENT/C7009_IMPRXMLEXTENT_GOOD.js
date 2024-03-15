function C7009_IMPRXMLEXTENT_BAD_01() {
    const express = require('express');
    const libxmljs = require("libxmljs");
    router.post("/patched", (req, res) => {
        if (req.files.products && req.files.products.mimetype == "application/xml") {
            const products = libxmljs.parseXmlString(
                req.files.products.data.toString("utf8"),
                // 외부 엔티티 파싱을 허용하지 않도록 설정
                // 미설정 시 기본값은 false이지만, 명시적으로 선언을 해 주는 것이 좋음
                { noent: false }
            );
            return res.send(products.get("//foo").text());
        }
        return res.send("fail");
    });
}