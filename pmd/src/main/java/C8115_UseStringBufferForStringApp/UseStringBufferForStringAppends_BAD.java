package C8115_UseStringBufferForStringApp;

public class UseStringBufferForStringAppends_BAD {
    public class Foo {
        String inefficientConcatenation() {
            String result = "";
            for (int i = 0; i < 10; i++) {
                result += getStringFromSomeWhere(i);
            }
            return result;
        }

        private String getStringFromSomeWhere(int i) {
            return null;
        }
    }
}
