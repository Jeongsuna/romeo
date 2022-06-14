package C8010_JUnit4TestShouldUseTestAnno;

public class JUnit4TestShouldUseTestAnnotation_BAD {
    public class Foo {
        public void testMethod() {
            bar();
        }
    }
    private void bar() {
    }
}
