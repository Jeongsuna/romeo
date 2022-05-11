package C9032_INSTANTOFCLASS;

public class C9032_INSTANTOFCLASS_bad {
    static class bad_TextUtils {
        public static String bad_foo(String source) {
            return source.replaceAll("<[^>]+>", "");
        }
    }

    public void cleanText(String source) {
        bad_TextUtils tu = new bad_TextUtils(); // Noncompliant

        String stripped = tu.bad_foo(source);

        //...
    }
}


