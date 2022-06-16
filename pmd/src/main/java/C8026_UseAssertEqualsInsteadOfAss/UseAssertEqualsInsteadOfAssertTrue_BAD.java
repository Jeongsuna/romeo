package C8026_UseAssertEqualsInsteadOfAss;

import junit.framework.TestCase;

public class UseAssertEqualsInsteadOfAssertTrue_BAD {
    public class TestClass extends TestCase {
        void testMethod() {
            Object x = null, y = null;
            assertTrue(x.equals(y));
        }
    }
}
