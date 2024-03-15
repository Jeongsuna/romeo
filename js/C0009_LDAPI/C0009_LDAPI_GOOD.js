function C0009_LDAPI_GOOD_01() {
    const express = require('express');
    const ldap = require('ldapjs');
    const parseFilter = require('ldapjs').parseFilter;

    const config = {
        url: 'ldap://ldap.forumsys.com',
        base: 'dc=example,dc=com',
        dn: 'cn=read-only-admin,dc=example,dc=com',
        secret: 'd0accf0ac0dfb0d0fd...',
    };

    async function searchLDAP (search) {
    // ...
    }

    router.get("/patched", async (req, res) => {

        let search;

        // 사용자의 입력에 필터링을 적용해 공격에 사용될 수 있는 문자 발견 시
        // 사용자에게 잘못된 요청값임을 알리고, 질의문을 요청하지 않음
        try {
            search = parseFilter(req.query.search);
        } catch {
            return res.send('잘못된 요청값입니다.');
        }

        const result = await searchLDAP(search);
        return res.send(result);
    });
}
