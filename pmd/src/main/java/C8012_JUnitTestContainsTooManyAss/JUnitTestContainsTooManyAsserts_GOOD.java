package C8012_JUnitTestContainsTooManyAss;

import junit.framework.TestCase;

public class JUnitTestContainsTooManyAsserts_GOOD {
    public class Foo extends TestCase {
        public void FooWithOneAssert() {
            boolean bar = false;
            assertFalse("should be false", bar);
        }
    }
}
