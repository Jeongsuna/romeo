package C8058_UnnecessaryAnnotationValueE;

public class UnnecessaryAnnotationValueElement_GOOD {
    @TestClassAnnotation("TEST")
    public class Foo {

        @TestMemberAnnotation("TEST")
        private String y;

        @TestMethodAnnotation("TEST")
        public void bar() {
            int x = 42;
            return;
        }
    }
}

