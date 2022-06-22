package C800F_JUnit4TestShouldUseBeforeAn;
import junit.framework.TestCase;
import org.junit.Before;
public class JUnit4TestShouldUseBeforeAnnotation_GOOD {
    public class Foo extends TestCase {
        @Before public void setUp() {
            test();
        }

        private void test() {
        }
    }
}
