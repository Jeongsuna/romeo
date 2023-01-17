/*
Origin Filename : KRD_301_TOC_TOU__basic_canRead_0101_bad.java
CWEID    : CWE367_TOC_TOU
sinkname : canRead
sinkline : 48,
makedate : 2012 08 20
license  : Copyright KISA.
*/
package com.example.kotlin.C0020_TOCTOU

import testcasesupport.IO
import java.io.*
import kotlin.Throws

// from K
class C0020_TOCTOU__basic_canRead_0101_bad
{
    @Throws(Throwable::class)
    fun bad() {
        val log_bsnk: java.util.logging.Logger = java.util.logging.Logger.getLogger("local-logger")
        val f = File("c:\\toctou.txt") /* may need to be adjusted depending on script */
        if (!f.exists()) {
            IO.writeLine("The file does not exist!")
            return
        }
        var bufread2: BufferedReader? = null
        var inread2: InputStreamReader? = null
        var finstr2: FileInputStream? = null

        var line: String = ""
        try {
            finstr2 = FileInputStream("c:\\toctou.txt")
            inread2 = InputStreamReader(finstr2)
            bufread2 = BufferedReader(inread2)

            /*
            * Instructions: see the TOCTOU effect
            * During delay, swap the "test_evil.txt" and "test_bad.txt" files (or contents).
            */
            /* POSSIBLE FLAW: Delay between file access check and file read */
            IO.writeLine("Intentional delay. Hit return to continue.")
            bufread2.readLine()
            while (bufread2.readLine().also { line = it } != null) {
                IO.writeLine(line)
            }
        } catch (e: IOException) {
            log_bsnk.warning("Error reading from console")
        } finally {
            try {
                if (bufread2 != null) {
                    bufread2.close()
                }
            } catch (e: IOException) {
                log_bsnk.warning("Error closing bufread2")
            } finally {
                try {
                    if (inread2 != null) {
                        inread2.close()
                    }
                } catch (e: IOException) {
                    log_bsnk.warning("Error closing inread2")
                } finally {
                    try {
                        if (finstr2 != null) {
                            finstr2.close()
                        }
                    } catch (e: IOException) {
                        log_bsnk.warning("Error closing finstr2")
                    }
                }
            }
        }
    }
}