package C8011_JUnitAssertionsShouldInclud;

import junit.framework.TestCase;

public class JUnitAssertionsShouldIncludeMessage_GOOD {
    public class Test extends TestCase {
        public void testMethod() {
            assertEquals("test does not equals foo", "test", "foo");
        }
    }
}
