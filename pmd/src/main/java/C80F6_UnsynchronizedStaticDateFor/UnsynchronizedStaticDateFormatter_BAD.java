package C80F6_UnsynchronizedStaticDateFor;


import java.text.SimpleDateFormat;

public class UnsynchronizedStaticDateFormatter_BAD {
    public static class Foo {
        private static final SimpleDateFormat sdf = new SimpleDateFormat();
        void bar() {
            sdf.format("yyyy/dd/MM");
        }
    }
}
