function C0009_LDAPI_BAD_01() {
    const express = require('express');
    const ldap = require('ldapjs');
    const config = {
        url: 'ldap://ldap.forumsys.com',
        base: 'dc=example,dc=com',
        dn: 'cn=read-only-admin,dc=example,dc=com',
        secret: 'd0accf0ac0dfb0d0fd...',
    };
    async function searchLDAP (search) {
    //...
    }
    router.get("/vuln", async (req, res) => {
        // 사용자의 입력을 그대로 LDAP 질의문으로 사용해 권한 상승 등의 공격에 노출
        const search = req.query.search;
        const result = await searchLDAP(search);
        return res.send(result);
    });
}