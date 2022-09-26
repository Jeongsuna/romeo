package romeo

import romeo.C0017_KEYLEN.key.ALGORITHM
import romeo.C0017_KEYLEN.key.PRIVATE_KEY_FILE
import romeo.C0017_KEYLEN.key.PUBLIC_KEY_FILE
import java.io.File
import java.security.KeyPairGenerator


class C0017_KEYLEN {
    object key {
        const val ALGORITHM = "RSA";
        const val PRIVATE_KEY_FILE = "C:/keys/private.key";
        const val PUBLIC_KEY_FILE = "C:/keys/public.key";
    }

    fun bad() {
        val keyGen = KeyPairGenerator.getInstance(ALGORITHM)
        // RSA 키 길이를 1024 비트로 짧게 설정하는 경우 안전하지 않다.
        keyGen.initialize(1024)
        val key = keyGen.generateKeyPair()
        val privateKeyFile: File = File(PRIVATE_KEY_FILE)
        val publicKeyFile: File = File(PUBLIC_KEY_FILE)
    }

    fun good() {
        val keyGen = KeyPairGenerator.getInstance(ALGORITHM)
        keyGen.initialize(2048)
        val key = keyGen.generateKeyPair()
        val privateKeyFile = File(PRIVATE_KEY_FILE)
        val publicKeyFile = File(PUBLIC_KEY_FILE)
    }
}