package romeo

import java.io.File

class C0012_WRONGPERM {
    @Throws(Throwable::class)
    fun bad1() {
        val file = File("/home/setup/system.ini")
        /* FLAW */
            file.setExecutable(true, false)
            file.setReadable(true, false)
            file.setWritable(true, false)
    }
    @Throws(Throwable::class)
    fun good1() {
        val file = File("/home/setup/system.ini")
        file.setExecutable(false)
        file.setReadable(true)
        file.setWritable(false)
    }

    @Throws(Throwable::class)
    fun bad2() {
        val file = File("c:\\report.txt")
        /* FLAW */
        file.setExecutable(true)
    }
    @Throws(Throwable::class)
    fun good2() {
    }

}