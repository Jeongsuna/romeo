package C800D_JUnit4SuitesShouldUseSuiteA;


import junit.framework.TestCase;

public class JUnit4SuitesShouldUseSuiteA_BAD {
    public static class BadExample extends TestCase {
        public static Test suite(){
            return new Suite();
        }
        private static class Suite extends Test {
        }
    }
    private static class Test {
    }
}

