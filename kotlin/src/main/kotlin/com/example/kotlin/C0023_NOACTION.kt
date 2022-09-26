package romeo

import java.io.File

class C0023_NOACTION {
    fun bad(fileName: String) {
        try {
            File(fileName).forEachLine { println(it) }
        } catch (exception: java.io.FileNotFoundException)  {
            /* FLAW: do nothing if the file doesn't exist */
        }
    }

    fun good(fileName: String) {
        try {
            File(fileName).forEachLine { println(it) }
        } catch (exception: java.io.FileNotFoundException)  {
            writeLine(fileName + "is not found")
        }
    }

    fun writeLine(str: String) {
        System.out.println(str)
    }
}