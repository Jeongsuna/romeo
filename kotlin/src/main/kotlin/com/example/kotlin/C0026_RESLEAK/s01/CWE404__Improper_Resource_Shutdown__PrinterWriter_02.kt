package com.example.kotlin.C0026_RESLEAK.s01

import java.io.*

class CWE404__Improper_Resource_Shutdown__PrinterWriter_02 {
    // eclipse jdt can detect
    fun badNoClose(file: File, enc: String) {
        try {
            // Flaw:
            val out = PrintWriter(
                OutputStreamWriter(
                    FileOutputStream(file), enc
                )
            )
            out.append('c')
        } catch (e: UnsupportedEncodingException) {
            e.printStackTrace()
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
    }

    fun bad(file: File, enc: String) {
        badNoClose(file, enc)
    }
}