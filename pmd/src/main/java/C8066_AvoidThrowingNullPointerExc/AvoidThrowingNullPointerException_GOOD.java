package C8066_AvoidThrowingNullPointerExc;

import java.util.Objects;

public class AvoidThrowingNullPointerException_GOOD {
    public class Test {
        private String eValue;

        void foo(String eValue) {
            this.eValue = Objects.requireNonNull(eValue, "eValue");
        }
    }
}
