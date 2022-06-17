package C807E_SimplifyBooleanAssertion;

import junit.framework.TestCase;

public class SimplifyBooleanAssertion_GOOD {
    public class SimpleTest extends TestCase {
        boolean r = false;
        public void testX() {
            assertFalse("r status", r);
            assertTrue(r);
        }
    }
}
