package C8011_JUnitAssertionsShouldInclud;

import junit.framework.TestCase;

public class JUnitAssertionsShouldIncludeMessage_BAD {
    public class Test extends TestCase {
        public void testMethod() {
            assertEquals("test", "foo");
        }
    }
}
