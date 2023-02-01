package com.example.kotlin.C000F_FORMATI.s01

import java.util.*

class C000F_FORMATI__simple_01 {
    fun bad(args: Array<String>) {
        val validDate = Calendar.getInstance()
        validDate[2014, Calendar.OCTOBER] = 14
        if (args.isEmpty()) {
            println("Please Input Date (YYYY-MM-DD) !!!")
            return
        }
        /* FLAW : CWE-134 */
        System.out.printf(
            args[0] + " did not match! HINT: It was issued on %1\$terd of some month",
            validDate
        )
    }

    fun good(args: Array<String?>) {
        val validDate = Calendar.getInstance()
        validDate[2014, Calendar.OCTOBER] = 14
        if (args.isEmpty()) {
            println("Please Input Date (YYYY-MM-DD) !!!")
            return
        }
        System.out.printf("%s did not match! HINT: It was issued on %2\$terd of some month", args[0], validDate)
    }
}