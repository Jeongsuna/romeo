package com.example.kotlin.C002B_SYSTEMLEAK.s01

import testcasesupport.IO
import java.io.IOException
import java.util.logging.Level

class C002B_SYSTEMLEAK__simple_01 {
    fun bad() {
        try {
            func()
        } catch (e: IOException) {
            // 오류 발생시 화면에 출력된 시스템 정보를 통해 다른 공격의 빌미를 제공 한다.
            /* FLAW : CWE-497 */
            System.err.print(e.message)
        }
    }

    fun good() {
        try {
            func()
        } catch (e: IOException) {
            // 오류와 관련된 최소한의 정보만을 제공하도록한다.
            IO.logger.log(Level.WARNING, "IOException Occured : ", e.toString())
        }
    }

    @Throws(IOException::class)
    fun func() {
        val testList = byteArrayOf('c'.code.toByte(), 'o'.code.toByte(), 'd'.code.toByte(), 'e'.code.toByte())
        System.out.write(testList)
    }
}