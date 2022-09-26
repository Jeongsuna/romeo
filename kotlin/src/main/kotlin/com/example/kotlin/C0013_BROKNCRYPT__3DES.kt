package romeo

import com.example.kotlin.Util
import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.spec.SecretKeySpec

class C0013_BROKNCRYPT__3DES {
    fun bad() {
        val CIPHER_INPUT = "ABCDEFG123456"
        val keyGenerator = KeyGenerator.getInstance("DESede")

        /* Perform initialization of KeyGenerator */
        keyGenerator.init(112)

        val secretKey = keyGenerator.generateKey()
        val byteKey = secretKey.encoded

        /* FLAW: Use a weak crypto algorithm, 3DES */
        val secretKeySpec = SecretKeySpec(byteKey, "DESede")
        val tripleDesCipher = Cipher.getInstance("DESede")
        tripleDesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec)
        val encrypted = tripleDesCipher.doFinal(CIPHER_INPUT.toByteArray(charset("UTF-8")))

        Util.writeLine(String(encrypted))
    }
    fun good() {
        val CIPHER_INPUT = "ABCDEFG123456"
        val keyGenerator = KeyGenerator.getInstance("AES")

        /* Perform initialization of KeyGenerator */
        keyGenerator.init(128)

        val secretKey = keyGenerator.generateKey()
        val byteKey = secretKey.encoded

        /* FIX: Use a stronger crypto algorithm, AES */
        val secretKeySpec = SecretKeySpec(byteKey, "AES")
        val aesCipher = Cipher.getInstance("AES")
        aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec)
        val encrypted = aesCipher.doFinal(CIPHER_INPUT.toByteArray(charset("UTF-8")))

        Util.writeLine(String(encrypted))
    }
}