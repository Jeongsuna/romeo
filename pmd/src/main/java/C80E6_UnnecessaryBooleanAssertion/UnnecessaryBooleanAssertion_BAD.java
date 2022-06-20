package C80E6_UnnecessaryBooleanAssertion;

import junit.framework.TestCase;

public class UnnecessaryBooleanAssertion_BAD {
    public class SimpleTest extends TestCase {
        public void testX() {
            assertTrue(true);
        }
    }
}
