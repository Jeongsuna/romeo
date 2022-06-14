package C8013_JUnitTestsShouldIncludeAsse;

import junit.framework.TestCase;

public class JUnitTestsShouldIncludeAssert_BAD {
    public class TestClass extends TestCase {
        public void far() {
            Bar b = findBar();
            b.work();
        }

        private Bar findBar() {
            return null;
        }

        private class Bar {
            public void work() {
            }
        }
    }
}
