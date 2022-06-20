package C80B3_DoNotThrowExceptionInFinall;

public class DoNotThrowExceptionInFinally_BAD {
    public class Foo {
        public void bar() throws Exception {
            try {
            } catch( Exception e) {
            } finally {
                throw new Exception();
            }
        }
    }
}
