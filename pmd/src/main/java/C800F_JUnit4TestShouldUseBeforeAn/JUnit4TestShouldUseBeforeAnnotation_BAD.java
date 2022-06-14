package C800F_JUnit4TestShouldUseBeforeAn;

public class JUnit4TestShouldUseBeforeAnnotation_BAD {
    public class Foo {
        public void setUp() {
            test();
        }

        private void test() {
        }
    }
}
