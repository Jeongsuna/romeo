package com.example.kotlin

import java.net.InetAddress
import javax.servlet.http.HttpServletRequest

class C002E_DNSLOOKUP_2 {
    fun bad(req: HttpServletRequest, res: HttpServletRequest) {
        val ip = req.remoteAddr
        val addr = InetAddress.getByName(ip)
        // 도메인은 공격자에 의해 실행되는 서버의 DNS가 변경될 수 있으므로 안전하지 않다.
        if(addr.canonicalHostName.endsWith("trustme.com")) {
            do_something_for_Trust_System()
        }

        val newAddr = InetAddress.getByName(ip).canonicalHostName
    }

    fun good(req: HttpServletRequest, res: HttpServletRequest) {
        val ip = req.remoteAddr
        val trustedAddr = "127.0.0.1"
        if(ip.equals(trustedAddr)) {
            do_something_for_Trust_System()
        }
    }

    fun do_something_for_Trust_System() {
        // ...
    }
}