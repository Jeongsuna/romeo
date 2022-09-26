package romeo

import com.example.kotlin.Util
import java.security.MessageDigest
import java.security.SecureRandom

class C001D_ONEWAYHASH__basic {
    @Throws(Throwable::class)
    fun bad() {
        val hash = MessageDigest.getInstance("SHA-512")

        /* FLAW: SHA512 with no salt */
        val hashValue = hash.digest("hash me".toByteArray(charset("UTF-8")))
        Util.writeLine(String(hashValue))
    }

    @Throws(Throwable::class)
    private fun good() {
        val hash = MessageDigest.getInstance("SHA-512")

        /* FIX: Use a sufficiently random salt */
        val prng: SecureRandom = SecureRandom.getInstance("SHA1PRNG")
        hash.update(prng.generateSeed(32))
        val hashValue = hash.digest("hash me".toByteArray(charset("UTF-8")))
        Util.writeLine(String(hashValue))
    }
}