package C8117_HardCodedCryptoKey;

import javax.crypto.spec.SecretKeySpec;

public class HardCodedCryptoKey_BAD {
    public class Foo {
        void bad() {
            SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES");
        }
    }
}
