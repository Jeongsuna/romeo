package C800D_JUnit4SuitesShouldUseSuiteA;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({MethodOne.class, MethodTwo.class})
public class JUnit4SuitesShouldUseSuiteA_GOOD {
}
