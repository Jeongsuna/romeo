package C8005_AvoidReassigningParameters;

public class AvoidReassigningParameters_GOOD {
    public class Test {
        private void testMethod(String foo) {
            String tmp = foo;
            tmp = "something else";
        }
    }
}
