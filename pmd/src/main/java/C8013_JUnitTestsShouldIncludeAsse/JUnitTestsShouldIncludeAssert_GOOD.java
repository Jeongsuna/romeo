package C8013_JUnitTestsShouldIncludeAsse;

import junit.framework.TestCase;

public class JUnitTestsShouldIncludeAssert_GOOD {
    public class TestClass extends TestCase {
        public void far() {
            Bar b = findBar();
            assertNotNull("bar not found", b);
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
