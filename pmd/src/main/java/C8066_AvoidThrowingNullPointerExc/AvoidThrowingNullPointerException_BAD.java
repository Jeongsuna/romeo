package C8066_AvoidThrowingNullPointerExc;

public class AvoidThrowingNullPointerException_BAD {
    public class Test {
        void foo() {
            throw new NullPointerException();
        }
    }
}
