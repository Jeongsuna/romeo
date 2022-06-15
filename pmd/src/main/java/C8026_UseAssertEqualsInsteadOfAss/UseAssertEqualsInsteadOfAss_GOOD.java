package C8026_UseAssertEqualsInsteadOfAss;

import junit.framework.TestCase;

public class UseAssertEqualsInsteadOfAss_GOOD {
    public class TestClass extends TestCase {
        void testMethod() {
            Object x = null, y = null;
            assertEquals("x should equals y", x, y);
        }
    }
}
