package C8014_JUnitUseExpected;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.fail;

public class JUnitUseExpected_GOOD {
    public class Foo extends TestCase {
        @Test(expected=Exception.class)
        public void bar() {
            testMethod();
        }
        private void testMethod() {
        }
    }
}
