package com.example.kotlin.C0026_RESLEAK.s01

import java.io.*

class CWE404__Improper_Resource_Shutdown__PrinterWriter_01 {
    // eclipse jdt cannot detect
    @Throws(IOException::class)
    fun badAssign(file: File, enc: String) {
        lateinit var out: PrintWriter
        try {
            out = try {
                // Flaw:
                PrintWriter(
                    OutputStreamWriter(
                        FileOutputStream(file), enc
                    )
                )
            } catch (ue: UnsupportedEncodingException) {
                PrintWriter(FileWriter(file))
            }
            out!!.append('c')
        } catch (e: IOException) {
        } finally {
            if (out != null) {
            }
        }
    }

    @Throws(IOException::class)
    fun bad(file: File, enc: String) {
        badAssign(file, enc)
    }

    @Throws(IOException::class)
    fun goodAssign(file: File, enc: String) {
        lateinit var out: PrintWriter
        try {
            out = try {
                PrintWriter(
                    OutputStreamWriter(
                        FileOutputStream(file), enc
                    )
                )
            } catch (ue: UnsupportedEncodingException) {
                PrintWriter(FileWriter(file))
            }
            out!!.append('c')
        } catch (e: IOException) {
        } finally {
            out.close()
        }
    }

    @Throws(IOException::class)
    fun good(file: File, enc: String) {
        goodAssign(file, enc)
    }
}