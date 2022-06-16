package C8029_UseAssertTrueInsteadOfAsser;

import junit.framework.TestCase;

public class UseAssertTrueInsteadOfAssertEquals_GOOD {
    public class TestClass extends TestCase {
        public void testMethod() {
            boolean foo = true;
            assertTrue("foo is true", foo);
        }
    }
}
