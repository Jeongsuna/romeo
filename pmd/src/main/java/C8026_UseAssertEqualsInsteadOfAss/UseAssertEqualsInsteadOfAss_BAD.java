package C8026_UseAssertEqualsInsteadOfAss;

import junit.framework.TestCase;

public class UseAssertEqualsInsteadOfAss_BAD {
    public class TestClass extends TestCase {
        void testMethod() {
            Object x = null, y = null;
            assertTrue(x.equals(y));
        }
    }
}
