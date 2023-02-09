package com.example.kotlin

import org.springframework.stereotype.Controller
import javax.servlet.http.HttpServletRequest

@Controller
class C0029_LEAKSESS_GOOD_2 {

    fun good(req: HttpServletRequest) {
        var currentPage = Integer.parseInt(req.getParameter("page"))
    }
}