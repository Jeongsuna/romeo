package C8028_UseAssertSameInsteadOfAsser;

import junit.framework.TestCase;

public class UseAssertSameInsteadOfAssertTrue_GOOD {
    public class TestClass extends TestCase {
        void testMethod() {
            Object x = null, y = null;
            assertSame(x, y);
        }
    }
}
