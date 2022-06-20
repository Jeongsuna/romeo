package C8118_InsecureCryptoIv;

import java.security.SecureRandom;

public class InsecureCryptoIv_GOOD {
    public class Foo {
        byte[] bytes = new byte[16];
        void good() {
            SecureRandom random = new SecureRandom();
            byte iv[] = new byte[16];
            random.nextBytes(bytes);
        }
    }
}
