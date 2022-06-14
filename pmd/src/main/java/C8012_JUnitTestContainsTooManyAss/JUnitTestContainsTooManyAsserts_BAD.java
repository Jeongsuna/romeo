package C8012_JUnitTestContainsTooManyAss;

import junit.framework.TestCase;

public class JUnitTestContainsTooManyAsserts_BAD {
    public class Foo extends TestCase {
        public void FooWithMoreAsserts() {
            boolean bar = false;
            assertFalse("bar should be false", bar);
            assertEquals("should equals false", false, bar);
        }
    }
}
