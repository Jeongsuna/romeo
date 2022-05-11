package C9032_INSTANTOFCLASS;

public class C9032_INSTANTOFCLASS_good {
    static class good_TextUtils {
        public static String good_foo(String source) {
            return source.replaceAll("<[^>]+>", "");
        }
    }

    public void cleanText(String source) {
        String stripped = good_TextUtils.good_foo(source);

        //...
    }
}


