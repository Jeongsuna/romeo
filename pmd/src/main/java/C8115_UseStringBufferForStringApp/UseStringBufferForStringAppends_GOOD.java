package C8115_UseStringBufferForStringApp;

public class UseStringBufferForStringAppends_GOOD {
    public class Foo {
        String efficientConcatenation() {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                result.append(getStringFromSomeWhere(i));
            }
            return result.toString();
        }
        private String getStringFromSomeWhere(int i) {
            return null;
        }
    }
}
