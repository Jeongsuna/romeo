function C7009_IMPRXMLEXTENT_GOOD_01() {
    const express = require('express');
    const xpath = require('xpath');
    const dom = require('xmldom').DOMParser;
    const xml = 
 `＜users>
＜user>
 ＜login>john＜/login>
 ＜password>abracadabra＜/password>
 ＜home_dir>/home/john＜/home_dir>
 ＜/user>
＜user>
 ＜login>cbc＜/login>
 ＜password>1mgr8＜/password>
 ＜home_dir>/home/cbc＜/home_dir>
 ＜/user>
 ＜/users>`;
    router.get("/patched", (req, res) => {
        const userName = req.query.userName;
        const userPass = req.query.userPass;
        const doc = new dom().parseFromString(xml);
        // 인자화된 쿼리 생성
        const goodXPathExpr = xpath.parse(
            "//users/user[login/text()=$userName and password/text() =$userPass]/home_dir/text()"
        );
        // 쿼리문에 변수값 전달 및 XML 조회
        const selected = goodXPathExpr.select({
            node: doc,
            variables: { userName: userName, userPass: userPass }
        });
        try {
            const userPath = selected[0].toString();
            return res.send(`userPath = ${userPath}`);
        } catch {
            return res.send('not found');
        }
    });
}