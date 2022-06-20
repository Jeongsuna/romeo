package C8118_InsecureCryptoIv;

public class InsecureCryptoIv_BAD {
    public class Foo {
        void bad() {
            byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, };
        }
        void alsoBad() {
            byte[] iv = "secret iv in here".getBytes();
        }
    }
}
