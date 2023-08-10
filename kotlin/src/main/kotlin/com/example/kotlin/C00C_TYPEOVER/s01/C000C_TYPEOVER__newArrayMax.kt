package com.example.kotlin.C00C_TYPEOVER.s01

import javax.servlet.http.HttpServletRequest

class C000C_TYPEOVER__newArrayMax {
    fun bad(request: HttpServletRequest, msg_id: String) {

        var idxMaxOver = 2147483690

        var intNewArrayOver = Array(2147483648) { i -> i * 5 }
        val stringArrayOfNullVar = arrayOfNulls<String>(idxMaxOver)

    }

    fun good(request: HttpServletRequest, msg_id: String) {

        var idxMaxOver = 2147

        var intNewArrayOver = Array(2147) { i -> i * 5 }
        val stringArrayOfNullVar = arrayOfNulls<String>(idxMaxOver)

    }
}