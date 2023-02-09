package com.example.kotlin.C000A_CSRF

import java.io.IOException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.http.HttpSession

/*
Filename : CWE352_Cross_Site_Request_Forgery__getCookiesServlet_write_01_good.java
*/   class C000A_CWE352_Cross_Site_Request_Forgery__simple_01_good {
    @Throws(IOException::class)
    fun good(request: HttpServletRequest, response: HttpServletResponse, session: HttpSession) {
        // 요청 파라미터와 세션에 저장된 토큰을 비교해서 일치하는 경우에만 요청을 처리한다.
        val pToken = request.getParameter("param_csrf_token")
        val sToken = session.getAttribute("SESSION_CSRF_TOKEN") as String
        if (pToken != null && pToken == sToken) {
            // 일치하는 토큰이 존재하는 경우 -＞ 정상 처리
            response.writer.print("#success")
        } else {
            // 토큰이 없거나 값이 일치하지 않는 경우 -＞ 오류 메시지 출력
            response.writer.print("#fail")
        }
    }
}