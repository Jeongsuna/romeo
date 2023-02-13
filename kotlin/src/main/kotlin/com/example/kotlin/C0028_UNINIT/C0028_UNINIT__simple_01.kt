package com.example.kotlin.C0028_UNINIT

import java.io.IOException
import java.io.InputStream
import java.util.Properties

class C0028_UNINIT__simple_01 {
    fun bad(ins: InputStream) {
        // 초기화되지 않은 변수
        val service: String
        val props = Properties()
        try {
            if (ins != null && ins.available() > 0) {
                props.load(ins)
                service = props.getProperty("Service NO")
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        // 초기화되지 않은 변수 service가 사용되어 예상하지 못한 동작을 수행할 수 있다.
        /* FLAW : CWE-457 */
        if ("".equals(service)) service = "8080"

        val port: Int = Integer.parseInt(service)
    }

    fun good(ins: InputStream) {
        // 변수를 초기화하여 의도하지 않은 동작을 예방합니다.
        var service = ""
        val props = Properties()
        try {
            if (ins != null && ins.available() > 0) {
                props.load(ins)
                service = props.getProperty("Service NO")
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }

        if ("".equals(service)) service = "8080"
        val port: Int = Integer.parseInt(service)
    }
}