package C8067_AvoidThrowingRawExceptionTy;

public class AvoidThrowingRawExceptionTypes_BAD {
    public class Test {
        public void foo() throws Exception {
            throw new Exception();
        }
    }
}
