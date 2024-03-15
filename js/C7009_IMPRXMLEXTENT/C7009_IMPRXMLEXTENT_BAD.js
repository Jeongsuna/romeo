function C7009_IMPRXMLEXTENT_BAD_01() {
    const express = require('express');
    const libxmljs = require("libxmljs");
    router.post("/vuln", (req, res) => {
        if (req.files.products && req.files.products.mimetype == "application/xml") {
            const products = libxmljs.parseXmlString(
                req.files.products.data.toString("utf8"),
                // 외부 엔티티 파싱 허용 설정(미설정 시 기본값은 false)
                { noent: true }
            );
            return res.send(products.get("//foo").text());
        }
        return res.send("fail");
    });
}