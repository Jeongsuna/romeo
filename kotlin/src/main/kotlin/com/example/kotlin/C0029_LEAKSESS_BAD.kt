package com.example.kotlin

import org.springframework.stereotype.Controller
import javax.servlet.http.HttpServletRequest

@Controller
class C0029_LEAKSESS_BAD {
    private var currentPage = 1

    fun bad(req: HttpServletRequest) {
        currentPage = Integer.parseInt(req.getParameter("page"))
    }

}