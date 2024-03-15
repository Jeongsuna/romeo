function C7009_IMPRXMLEXTENT_BAD_01() {
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
    router.get("/vuln", (req, res) => {
        const userName = req.query.userName;
        const userPass = req.query.userPass;
        const doc = new dom().parseFromString(xml);
        // 조작된 입력값(/vuln?userName=john' or ''='&userPass="' or ''='“)을 통해
        // 패스워드 검사 로직을 우회할 수 있음
        const badXPathExpr = "//users/user[login/text()='" + userName
            + "' and password/text() = '" + userPass + "']/home_dir/text()";
        const selected = xpath.select(badXPathExpr, doc);
        try {
            const userPath = selected[0].toString();
            return res.send(`userPath = ${userPath}`);
        } catch {
            return res.send('not found');
        }
    });
}