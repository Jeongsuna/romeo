package C807E_SimplifyBooleanAssertion;

import com.sun.deploy.util.JVMParameters;
import junit.framework.TestCase;

public class SimplifyBooleanAssertion_BAD {
    public class SimpleTest extends TestCase {
        boolean r = false;
        public void testX() {
            assertTrue("r status", !r);
            assertFalse(!r);
        }
    }
}
