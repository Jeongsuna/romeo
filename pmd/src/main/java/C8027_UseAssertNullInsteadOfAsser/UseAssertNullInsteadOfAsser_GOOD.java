package C8027_UseAssertNullInsteadOfAsser;

import junit.framework.TestCase;

public class UseAssertNullInsteadOfAsser_GOOD {
    public class TestClass extends TestCase {
        void testMethod() {
            Object x = fooMethod();
            assertNull(x);
            assertNotNull(x);
        }

        private Object fooMethod() {
            return null;
        }
    }
}