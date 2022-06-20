package C80B3_DoNotThrowExceptionInFinall;

public class DoNotThrowExceptionInFinally_GOOD {
    public class Foo {
        public void bar() {
            try {
            } catch(Exception e) {
            } finally {
                //Do not Throw Exception In Finally
            }
        }
    }
}
