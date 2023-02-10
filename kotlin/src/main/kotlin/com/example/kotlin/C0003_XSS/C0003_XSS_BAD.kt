package com.example.kotlin.C0003_XSS

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class C0003_XSS_BAD {
    @Throws(Throwable::class)
    fun bad(request: HttpServletRequest, response: HttpServletResponse?): String? {
        val buffer = StringBuffer()
        val data = request.getParameter("data")
        //외부 입력값에 대하여 검증 없이 화면에 출력될 경우 공격스크립트가 포함된 URL을 생성 할 수 있어 안전하지 않다.
        /* FLAW  */
        buffer.append(data)
        return buffer.toString()
    }
}