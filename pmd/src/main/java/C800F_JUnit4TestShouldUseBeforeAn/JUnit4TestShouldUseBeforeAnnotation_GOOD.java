package C800F_JUnit4TestShouldUseBeforeAn;

public class JUnit4TestShouldUseBeforeAnnotation_GOOD {
    public class Foo {
        @Before public void setUp() {
            test();
        }

        private void test() {
        }
    }
}
