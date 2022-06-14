package C8005_AvoidReassigningParameters;

public class AvoidReassigningParameters_BAD {
    public class Test {
        private void testMethod(String foo) {
            foo = "something else";
        }
    }
}
