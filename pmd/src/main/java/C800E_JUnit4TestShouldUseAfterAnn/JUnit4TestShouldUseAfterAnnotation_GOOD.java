package C800E_JUnit4TestShouldUseAfterAnn;

public class JUnit4TestShouldUseAfterAnnotation_GOOD {
    public class Foo {
        @After public void tearDown() {
            test();
        }
        private void test() {
        }
    }
}
