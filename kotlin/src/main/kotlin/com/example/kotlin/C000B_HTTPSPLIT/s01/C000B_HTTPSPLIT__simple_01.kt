package com.example.kotlin.C000B_HTTPSPLIT.s01

import javax.servlet.http.Cookie
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class C000B_HTTPSPLIT__simple_01 {
    fun bad(request: HttpServletRequest, response: HttpServletResponse) {
        val lastLogin = request.getParameter("last_login")
        if (lastLogin == null || "" == lastLogin) {
            return
        }
        // 쿠키는 Set-Cookie 응답헤더로 전달되므로 개행문자열 포함 여부 검증이 필요
        /* FLAW : CWE-113 */
        val c = Cookie("LASTLOGIN", lastLogin)
        c.maxAge = 1000
        c.secure = true
        response.addCookie(c)
        response.contentType = "text/html"
    }

    fun good(request: HttpServletRequest, response: HttpServletResponse) {
        var lastLogin = request.getParameter("last_login")
        if (lastLogin == null || "" == lastLogin) {
            return
        }
        // 외부입력값에서 개행문자를 제거한 후 쿠키의 값으로 설정
        lastLogin = lastLogin.replace("[\\r\\n]".toRegex(), "")
        val c = Cookie("LASTLOGIN", lastLogin)
        c.maxAge = 1000
        c.secure = true
        response.addCookie(c)
        response.contentType = "text/html"
    }
}