package C8029_UseAssertTrueInsteadOfAsser;

import junit.framework.TestCase;
import java.util.Optional;

public class UseAssertTrueInsteadOfAssertEquals_BAD {
    public class TestClass extends TestCase {
        public void testMethod() {
            boolean foo = true;
            assertEquals("foo is true", true, foo);
            assertEquals("foo is false", Optional.of(Boolean.FALSE), foo);
        }
    }
}
