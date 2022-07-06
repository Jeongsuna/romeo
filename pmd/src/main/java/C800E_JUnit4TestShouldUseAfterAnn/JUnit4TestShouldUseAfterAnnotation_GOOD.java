package C800E_JUnit4TestShouldUseAfterAnn;
import junit.framework.TestCase;
import org.junit.After;
public class JUnit4TestShouldUseAfterAnnotation_GOOD {
    public class Foo extends TestCase {
        @After public void tearDown() {
            test();
        }
        private void test() {
        }
    }
}
