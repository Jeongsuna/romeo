package C800E_JUnit4TestShouldUseAfterAnn;

import junit.framework.TestCase;

public class JUnit4TestShouldUseAfterAnnotation_BAD {
    public class Foo extends TestCase {
        public void tearDown() {
            test();
        }
        private void test() {
        }
    }
}
