package C8040_FormalParameterNamingConven;

import java.util.function.Consumer;

public class FormalParameterNamingConventions_GOOD {
     class Foo {
        void bar(int myInt){};
        void lambdas() {
            Consumer<String> lambda1 = (String str) -> {};
        }
    }
}


