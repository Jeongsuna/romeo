package C80E6_UnnecessaryBooleanAssertion;

import junit.framework.TestCase;

public class UnnecessaryBooleanAssertion_GOOD {
    public class SimpleTest extends TestCase {
        public void testX() {
            fail("error");
        }
    }
}
