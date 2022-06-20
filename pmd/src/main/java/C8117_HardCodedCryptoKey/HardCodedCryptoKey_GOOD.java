package C8117_HardCodedCryptoKey;

import javax.crypto.spec.SecretKeySpec;

public class HardCodedCryptoKey_GOOD {
    public class Foo {
        void good() {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Properties.getKey(), "AES");
        }
    }
    private static class Properties{
        private static byte[] getKey() {
            return new byte[0];
        }
    }
}
