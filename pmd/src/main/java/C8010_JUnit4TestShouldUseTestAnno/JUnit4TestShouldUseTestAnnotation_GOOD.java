package C8010_JUnit4TestShouldUseTestAnno;

import org.junit.Test;

public class JUnit4TestShouldUseTestAnnotation_GOOD {
    public class Foo {
        @Test
        public void testMethod() {
            bar();
        }
    }
    private void bar() {
    }
}