package C800F_JUnit4TestShouldUseBeforeAn;

import junit.framework.TestCase;

public class JUnit4TestShouldUseBeforeAnnotation_BAD {
    public class Foo extends TestCase {
        public void setUp() {
            test();
        }

        private void test() {
        }
    }
}
