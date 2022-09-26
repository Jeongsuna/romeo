package romeo

import java.io.IOException

class C0022_LEAKMSG {
    fun bad() {
        try{
            // ...
        } catch (e: IOException) {
            e.printStackTrace()
            System.err.print(e.message)
        }
    }

    fun good() {
        val log = org.slf4j.LoggerFactory.getLogger("Log")
        try {
            // ..
        } catch (e: IOException) {
            log.error("error!")
        }
    }
}