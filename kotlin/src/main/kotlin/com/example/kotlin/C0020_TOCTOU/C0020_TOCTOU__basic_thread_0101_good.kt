/*
Origin Filename : KRD_301_TOC_TOU__basic_thread_0101_good.java
CWEID    : CWE367_TOC_TOU
sinkname : thread
sinkline : 39,69
makedate : 2012 08 20
license  : Copyright KISA.
*/
package romeo

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.IOException
import kotlin.jvm.Synchronized

// from K
class C0020_TOCTOU__basic_thread_0101_good {
    fun good() {
        val fileAccessThread = FileAccessThread2()
        val fileDeleteThread = FileDeleteThread2()
        fileAccessThread.start()
        fileDeleteThread.start()
    }
}

internal class FileAccessThread2 : Thread() {
    /* FIX */
    @Synchronized
    override fun run() {
        var br: BufferedReader? = null
        try {
            val f = File("c:\\toctou.txt")
            if (f.exists()) {
                br = BufferedReader(FileReader(f))
            }
        } catch (e: IOException) {
            System.err.println("IOException occured")
        } finally {
            try {
                if (br != null) {
                    br.close()
                }
            } catch (e: IOException) {
                System.err.println("Error closing BufferedReader")
            }
        }
    }
}

internal class FileDeleteThread2 : Thread() {
    /* FIX */
    @Synchronized
    override fun run() {
        val f = File("c:\\toctou.txt")
        if (f.exists()) {
            f.delete()
        }
    }
}