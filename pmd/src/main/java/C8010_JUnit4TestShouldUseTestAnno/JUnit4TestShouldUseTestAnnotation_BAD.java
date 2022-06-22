package C8010_JUnit4TestShouldUseTestAnno;
import junit.framework.TestCase;
public class JUnit4TestShouldUseTestAnnotation_BAD {
    public class Foo extends TestCase{
        public void testMethod() {
            bar();
        }
    }
    private void bar() {
    }
}
