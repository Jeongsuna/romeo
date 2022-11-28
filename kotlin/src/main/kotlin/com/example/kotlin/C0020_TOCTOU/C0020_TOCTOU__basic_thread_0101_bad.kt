/*
Origin Filename : KRD_301_TOC_TOU__basic_thread_0101_bad.java
CWEID    : CWE367_TOC_TOU
sinkname : thread
sinkline : 29,37,70
makedate : 2012 08 20
license  : Copyright KISA.
*/
package romeo

// from K
class C0020_TOCTOU__basic_thread_0101_bad {
    fun bad() {
        val fileAccessThread = FileAccessThread()
        val fileDeleteThread = FileDeleteThread()
        /* FLAW */
        fileAccessThread.start()
        fileDeleteThread.start()
    }
}

internal class FileAccessThread : Thread() {
    /* FLAW */
    fun run() {
        lateinit var br: BufferedReader = null
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

internal class FileDeleteThread : Thread() {
    /* FLAW */
    fun run() {
        val f = File("c:\\toctou.txt")
        if (f.exists()) {
            f.delete()
        }
    }
}