package romeo


import com.example.kotlin.Util
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec


class C0019_HARDKEY {
    fun bad() {
        val data: String

        /* FLAW: Set data to a hardcoded value */
        data = "23 ~j;asn!@#/>as"

        if (data != null) {
            val stringToEncrypt = "Super secret Squirrel"
            val byteStringToEncrypt = stringToEncrypt.toByteArray(charset("UTF-8"))

            /* POTENTIAL FLAW: Use data as a cryptographic key */
            val secretKeySpec = SecretKeySpec(data.toByteArray(charset("UTF-8")), "AES")
            val aesCipher = Cipher.getInstance("AES")
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec)
            val byteCipherText = aesCipher.doFinal(byteStringToEncrypt)
            Util.writeLine(String(byteCipherText)) /* Write encrypted data to console */
        }
    }

    fun good() {
        var data: String

        /* Initialize data */
        data = ""

        /* read user input from console with readLine */
        try {
            val readerInputStream = InputStreamReader(System.`in`, "UTF-8")
            val readerBuffered = BufferedReader(readerInputStream)

            /* FIX: Read data from the console using readLine() */
            data = readerBuffered.readLine()
        } catch (exceptIO: IOException) {
            Util.writeLine("WARNING: Error with stream reading")
        }

        /* NOTE: Tools may report a flaw here because readerBuffered and readerInputStream are not closed.  Unfortunately, closing those will close System.in, which will cause any future attempts to read from the console to fail and throw an exception */
        if (data != null) {
            val stringToEncrypt = "Super secret Squirrel"
            val byteStringToEncrypt = stringToEncrypt.toByteArray(charset("UTF-8"))
            /* POTENTIAL FLAW: Use data as a cryptographic key */
            val secretKeySpec = SecretKeySpec(data.toByteArray(charset("UTF-8")), "AES")
            val aesCipher = Cipher.getInstance("AES")
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec)
            val byteCipherText = aesCipher.doFinal(byteStringToEncrypt)
            /* Write encrypted data to console */
            Util.writeLine(String(byteCipherText))
        }
    }
}