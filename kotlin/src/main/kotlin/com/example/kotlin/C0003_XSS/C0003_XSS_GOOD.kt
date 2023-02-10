package com.example.kotlin.C0003_XSS

import javax.servlet.annotation.WebFilter
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

// WebFilter 어노테이션을 설정하여 공격스크립트가 포함된 데이터를 걸러준다.
@WebFilter(urlPatterns = ["*/test/*"])
class C0003_XSS_GOOD {
    @Throws(Throwable::class)
    fun good(request: HttpServletRequest, response: HttpServletResponse?): String? {
        val buffer = StringBuffer()
        val data = request.getParameter("data")
        buffer.append(data)
        return buffer.toString()
    }
}