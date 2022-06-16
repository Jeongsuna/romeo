package C8027_UseAssertNullInsteadOfAsser;

import junit.framework.TestCase;

public class UseAssertNullInsteadOfAssertTrue_BAD {
    public class TestClass extends TestCase {
        void testMethod() {
            Object x = fooMethod();
            assertTrue(x==null);
            assertTrue(x != null);
        }

        private Object fooMethod() {
            return null;
        }
    }
}
