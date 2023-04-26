package com.example.kotlin.C0118_NOACSTOARGE

import android.content.Context
import java.io.FileOutputStream
import java.io.IOException

class C0118_NOACSTOARGE    // 생성자에서 Context 객체를 받아 멤버 변수에 저장
( // Context 객체를 저장하기 위한 멤버 변수
        private val context: Context) {
    fun bad() {
        val fname = "secret.txt"
        val foo = "sensitive data such as credit card number"
        var fos: FileOutputStream? = null
        try {
            fos = context.openFileOutput(fname, Context.MODE_WORLD_WRITEABLE)
            fos.write(foo.toByteArray())
            fos.close()
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }

    fun good() {
        val fname = "secret.txt"
        val foo = "sensitive data such as credit card number"
        var fos: FileOutputStream? = null
        try {
            fos = context.openFileOutput(fname, Context.MODE_PRIVATE)
            fos.write(foo.toByteArray())
            fos.close()
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }
}