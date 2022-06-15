package C8028_UseAssertSameInsteadOfAsser;

import junit.framework.TestCase;

public class UseAssertSameInsteadOfAsser_BAD {
    public class TestClass extends TestCase {
        void testMethod() {
            Object x= null, y = null;
            assertTrue(x == y);
        }
    }
}
