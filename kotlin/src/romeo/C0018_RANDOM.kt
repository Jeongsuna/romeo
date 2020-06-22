package romeo

import java.security.SecureRandom
import java.util.*


class C0018_RANDOM {
    fun bad() {
        val rand = Random()
        /* FLAW: seed is static, making the numbers always occur in the same sequence */
        rand.setSeed(123456)
        Util.writeLine("Random int: " + rand.nextInt(100))
    }

    fun good() {
        /* FIX: use SecureRandom to be cryptographically secure */
        val rand = SecureRandom()
        Util.writeLine("Random int: " + rand.nextInt(100))
    }
}