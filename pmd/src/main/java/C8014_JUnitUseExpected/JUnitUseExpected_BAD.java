package C8014_JUnitUseExpected;

import org.junit.Test;

import static org.junit.Assert.fail;

public class JUnitUseExpected_BAD {
    public class Foo {
        @Test
        public void bar() {
            try {
                testMethod();
                fail("should have thrown an exception");
            } catch (Exception e) {
            }
        }

        private void testMethod() {
        }
    }
}
