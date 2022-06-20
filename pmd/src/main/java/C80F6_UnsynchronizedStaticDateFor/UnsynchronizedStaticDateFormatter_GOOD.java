package C80F6_UnsynchronizedStaticDateFor;


import java.text.SimpleDateFormat;

public class UnsynchronizedStaticDateFormatter_GOOD {
    public static class Foo {
        private static final SimpleDateFormat sdf = new SimpleDateFormat();
        void bar() {
            synchronized (sdf) {
                sdf.format("yyyy/dd/MM");
            }
        }
    }
}
