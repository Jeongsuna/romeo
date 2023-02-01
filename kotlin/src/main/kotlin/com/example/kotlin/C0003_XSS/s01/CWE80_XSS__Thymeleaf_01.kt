package com.example.kotlin.C0003_XSS.s01

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class CWE80_XSS__Thymeleaf_01 {
    @RequestMapping("/")
    fun welcome(model: MutableMap<String, Any>, @RequestParam("id") id: String): String {
        model["id"] = id
        return "CWE80_XSS__Thymeleaf_01"
    }
}