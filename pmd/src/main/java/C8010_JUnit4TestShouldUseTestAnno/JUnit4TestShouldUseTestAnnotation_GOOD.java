package C8010_JUnit4TestShouldUseTestAnno;

import junit.framework.TestCase;
import org.junit.Test;

public class JUnit4TestShouldUseTestAnnotation_GOOD {
    public class Foo extends TestCase {
        @Test
        public void testMethod() {
            bar();
        }
    }
    private void bar() {
    }
}