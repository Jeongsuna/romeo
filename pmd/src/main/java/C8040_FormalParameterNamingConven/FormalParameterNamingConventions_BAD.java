package C8040_FormalParameterNamingConven;

import java.util.function.Consumer;

public class FormalParameterNamingConventions_BAD {
    class Foo {
        void bar(int my_i) {}
        void lambdas() {
            Consumer<String> lambda_1 = (String str) -> {};
        }
    }
}
