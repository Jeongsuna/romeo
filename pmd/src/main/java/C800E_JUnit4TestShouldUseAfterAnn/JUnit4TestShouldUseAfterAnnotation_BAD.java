package C800E_JUnit4TestShouldUseAfterAnn;

public class JUnit4TestShouldUseAfterAnnotation_BAD {
    public class Foo {
        public void tearDown() {
            test();
        }
        private void test() {
        }
    }
}
