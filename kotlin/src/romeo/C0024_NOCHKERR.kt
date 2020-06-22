package romeo

class C0024_NOCHKERR {
    fun bad() {
        try {
            "Test".toInt() /* Will throw NumberFormatException */
        } catch (exception: Exception) /* FLAW: Catch Exception, which is overly generic */ {
            Util.writeLine("Caught Exception")
            throw exception /* Rethrow */
        }
    }

    fun good() {
        try {
            "Test".toInt() /* Will throw NumberFormatException */
        } catch (exceptNumberFormat: NumberFormatException) /* FIX: Catch NumberFormatException */ {
            Util.writeLine("Caught Exception")
            throw exceptNumberFormat /* Rethrow */
        }
    }

}